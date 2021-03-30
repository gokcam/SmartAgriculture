package com.gok.smartagriculture.servis

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.gok.smartagriculture.model.Veri

@Dao
interface VeriDAO {


    @Insert
    suspend fun insertAll(vararg veri : Veri) : List<Long>

    @Query("SELECT * FROM veri")
    suspend fun gelAllVeri() : List<Veri>

    @Query("SELECT * FROM veri WHERE veriId = veriId")
    suspend fun getVeri(veriId : Int) : Veri

    @Query("SELECT * FROM veri")
    suspend fun deleteAllVeri()

}