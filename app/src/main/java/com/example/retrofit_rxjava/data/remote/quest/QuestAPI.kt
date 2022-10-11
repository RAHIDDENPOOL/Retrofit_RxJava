package com.example.retrofit_rxjava.data.remote.quest

import io.reactivex.Single
import retrofit2.http.GET

interface QuestAPI {
    @GET ("./getQuestList")
    fun getQuestList(): Single<MemeResponse>

}