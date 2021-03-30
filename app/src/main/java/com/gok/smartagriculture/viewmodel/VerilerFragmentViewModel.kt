package com.gok.smartagriculture.viewmodel

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.gok.smartagriculture.model.Veri
import com.gok.smartagriculture.servis.VeriDatabase
import kotlinx.coroutines.launch

class VerilerFragmentViewModel(application: Application) : BaseViewModel(application) {

    val veriler = MutableLiveData<List<Veri>>()


    fun refreshData(){
        val sabah = Veri("76","87","80")
        val ogle = Veri("30","42","90")
        val aksam = Veri("54","43","48")
        val sabah2 = Veri("76","87","80")
        val ogle2 = Veri("30","42","90")
        val aksam2 = Veri("54","43","48")
        val sabah3 = Veri("76","87","80")
        val ogle3 = Veri("30","42","90")
        val aksam3 = Veri("54","43","48")

        val veriListesi = arrayListOf<Veri>(sabah)
        veriler.value = veriListesi
        verileriGoster(veriListesi)

    }

        private fun sqlLiteSakla(veriListesi : List<Veri>) {
            launch {
                val dao = VeriDatabase(getApplication()).veriDAO()
                dao.deleteAllVeri()
                val uuidListesi = dao.insertAll(*veriListesi.toTypedArray())
                var i = 0
                while (i<veriListesi.size)
                {
                    veriListesi[i].veriId=uuidListesi[i].toInt()
                    i=i+1

                }
                verileriGoster(veriListesi)
            }


        }



    private fun verileriGoster(besinlerListesi : List<Veri>){

        veriler.value = besinlerListesi


    }

}