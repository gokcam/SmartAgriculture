package com.gok.smartagriculture.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gok.smartagriculture.model.Haber

class HaberlerFragmentViewModel : ViewModel() {

    val haberler = MutableLiveData<List<Haber>>()
    val haberHataMesaji = MutableLiveData<Boolean>()
    val haberYukleniyor = MutableLiveData<Boolean>()

    fun getHaber() {

    }

}