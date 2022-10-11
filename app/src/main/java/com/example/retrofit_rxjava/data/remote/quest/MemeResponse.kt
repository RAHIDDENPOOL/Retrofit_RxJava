package com.example.retrofit_rxjava.data.remote.quest

import com.example.retrofit_rxjava.data.remote.common.RemoteListItem
import com.google.gson.annotations.SerializedName

data class MemeResponse(val items: List<QuestListItem>)

data class QuestListItem(
    @SerializedName("questId")
    val questId: String,

    @SerializedName("questName")
    val name: String,

    @SerializedName("questSubtitle")
    val subtitle: String,

    @SerializedName("questImage")
    val image: String,

    @SerializedName("description")
    val items: List<RemoteListItem>
)
