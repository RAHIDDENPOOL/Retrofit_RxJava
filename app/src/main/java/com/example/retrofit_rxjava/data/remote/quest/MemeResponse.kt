package com.example.retrofit_rxjava.data.remote.quest

import com.google.gson.annotations.SerializedName

data class MemeResponse(val memes: List<MemesListItem>)

data class MemesListItem(
    @SerializedName("memeId")
    val memeId: String,

    @SerializedName("memeName")
    val memeName: String,

    @SerializedName("memeUrl")
    val memeUrl: String,

    @SerializedName("memeWidth")
    val memeWidth: String,

    @SerializedName("memeHeight")
    val memeHeight: String,

    @SerializedName("memeBox_count")
    val memeBox_count: String
)
