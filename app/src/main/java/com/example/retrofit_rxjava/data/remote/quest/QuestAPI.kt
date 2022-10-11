package com.example.retrofit_rxjava.data.remote.quest

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Headers

interface QuestAPI {
    @GET ("./getQuestList")
    @Headers("Content-Type: application/json")
    fun getQuestList(): Single<MemeResponse>

}