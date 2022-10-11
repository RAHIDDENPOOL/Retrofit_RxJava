package com.example.retrofit_rxjava.questList

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import com.example.retrofit_rxjava.data.remote.quest.QuestAPI
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class QuestListViewModel(application: Application) : AndroidViewModel(application) {
    private val compositeDisposable = CompositeDisposable()
    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }

    fun fetchQuestList(questAPI: QuestAPI?) {
        questAPI?.let {
            compositeDisposable.add(
                questAPI.getQuestList()
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe({
                        Log.d("TAG89", it.memes.first().toString())
                        Log.d("TAG90","key1")
                    }, {
                        Log.d("TAG88","key2")
                    })
            )
        }
    }
}