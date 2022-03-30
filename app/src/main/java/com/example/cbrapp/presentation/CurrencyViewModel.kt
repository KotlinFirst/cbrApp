package com.example.cbrapp.presentation

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import com.example.cbrapp.data.AppDatabase
import com.example.cbrapp.data.Currency
import com.example.cbrapp.data.ExampleJson
import com.example.cbrapp.data.api.ApiFactory
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.schedulers.Schedulers
import java.util.concurrent.TimeUnit

class CurrencyViewModel(application: Application) : AndroidViewModel(application) {
    private val db = AppDatabase.getInstance(application)
    private val compositeDisposable = CompositeDisposable()

    val currencyList = db.currencyInfoDao().getCurrencyList()

    init {
        loadData()
    }

    private fun loadData() {
        val disposable = ApiFactory.apiService.getValute()
            .map { it.Valute }
            .delaySubscription(10,TimeUnit.SECONDS)
            .repeat() //выполнит загрузку заново в случае успеха
            .retry() //выполнит загрузку заново в случае НЕ успеха
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                Log.d("TEST_OF_LOADING_DATA", it.toString())
            }, {
                Log.d("TEST_OF_LOADING_DATA", it.message.toString())
            })
        compositeDisposable.add(disposable)

    }


    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }
}