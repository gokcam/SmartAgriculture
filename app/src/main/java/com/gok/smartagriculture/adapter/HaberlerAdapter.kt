package com.gok.smartagriculture.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gok.smartagriculture.R
import com.gok.smartagriculture.model.Haber
import kotlinx.android.synthetic.main.recycler_row_haberler.view.*

class HaberlerAdapter(private val HaberListesi : ArrayList<Haber>) : RecyclerView.Adapter<HaberlerAdapter.HaberlerHolder>() {
    class HaberlerHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HaberlerHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.recycler_row_haberler,parent,false)
        return HaberlerHolder(view)

    }

    override fun onBindViewHolder(holder: HaberlerHolder, position: Int) {
        holder.itemView.recycler_row_haber_baslik.text = HaberListesi[position].haberBaslik
        holder.itemView.recycler_row_haber_metin.text = HaberListesi[position].haberMetin
        holder.itemView.recycler_row_haber_tarih.text = HaberListesi[position].haberTarih
        // holder.itemView.recycler_row_haber_image
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}