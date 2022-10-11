package com.example.retrofit_rxjava.questList

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.example.retrofit_rxjava.QuestApp
import com.example.retrofit_rxjava.R
import com.example.retrofit_rxjava.data.remote.quest.QuestAPI

class QuestListFragment : Fragment(R.layout.fragment_quest) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val questListViewModel = ViewModelProvider (this)[QuestListViewModel::class.java]
        questListViewModel.fetchQuestList((activity?.application as? QuestApp)?.questAPI)
    }
}
