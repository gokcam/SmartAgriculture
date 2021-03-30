package com.gok.smartagriculture.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gok.smartagriculture.R
import com.gok.smartagriculture.model.Veri
import kotlinx.android.synthetic.main.veriler_recycler_row.view.*

class VerilerAdapter(private val veriListesi : ArrayList<Veri>) : RecyclerView.Adapter<VerilerAdapter.VerilerHolder>() {
    class VerilerHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VerilerHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view =  inflater.inflate(R.layout.veriler_recycler_row,parent,false)
        return VerilerHolder(view)
    }

    override fun onBindViewHolder(holder: VerilerHolder, position: Int) {
        holder.itemView.recycler_row_sicaklik_textView.text = veriListesi[position].sicaklik
        holder.itemView.recycler_row_nem_textView.text = veriListesi[position].nem
        holder.itemView.recycler_row_pil_textView.text = veriListesi[position].pil
    }

    override fun getItemCount(): Int {
        return veriListesi.size
    }


    fun veriListesiGuncelle(yeniVeriListesi : List<Veri>)
    {
        veriListesi.clear()
        veriListesi.addAll(yeniVeriListesi)
        notifyDataSetChanged()
    }
   
}