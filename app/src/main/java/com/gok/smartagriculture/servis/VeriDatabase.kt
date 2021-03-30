package com.gok.smartagriculture.servis

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.gok.smartagriculture.model.Veri

@Database(entities = arrayOf(Veri::class),version = 1)
abstract class VeriDatabase : RoomDatabase(){

    abstract fun veriDAO() : VeriDAO

    companion object {

        @Volatile
        private var instance : VeriDatabase? = null

        private val lock = Any()

        operator fun invoke(context : Context) = instance ?: synchronized(lock){
            instance ?: databaseOlustur(context).also {
                instance = it
            }
        }


        private fun databaseOlustur(context: Context) = Room.databaseBuilder(
            context.applicationContext,
            VeriDatabase::class.java,"veridatabase").build()

    }

}