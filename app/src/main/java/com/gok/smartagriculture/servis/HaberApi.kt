package com.gok.smartagriculture.servis

import com.gok.smartagriculture.model.Haber
import io.reactivex.Single
import retrofit2.http.GET

interface HaberApi {

    @GET("gokcam/tarimHaberJson/main/haberlerJson.json")
    fun getHaber() : Single<List<Haber>>
}