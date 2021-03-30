package com.gok.smartagriculture.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class Haber(
        @ColumnInfo(name = "baslik")
        @SerializedName("baslik")
        val haberBaslik: String?,
        
        @ColumnInfo(name = "tarih")
        @SerializedName("tarih")
        val haberTarih: String?,

        @ColumnInfo(name = "gorsel")
        @SerializedName("gorsel")
        val haberGorsel : String?,

        @ColumnInfo(name = "metin")
        @SerializedName("metin")
        val haberMetin: String?


) {
    @PrimaryKey(autoGenerate = true)
    var uuid : Int = 0
}