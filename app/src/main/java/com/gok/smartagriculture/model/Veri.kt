package com.gok.smartagriculture.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Veri(

        @ColumnInfo(name = "gelenNem")
        var nem: String?,
        @ColumnInfo(name = "gelenSicaklik")
        var sicaklik: String?,
        @ColumnInfo(name = "gelenPil")
        var pil : String?) {

    @PrimaryKey(autoGenerate = true)
    var veriId : Int = 0

}