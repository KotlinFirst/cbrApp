package com.example.cbrapp.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cbrapp.R
import com.example.cbrapp.data.api.ApiFactory
import io.reactivex.rxjava3.disposables.CompositeDisposable

class MainActivity : AppCompatActivity() {

    private val compositeDisposable = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ApiFactory.apiService.getValute()
            .subscribe

    }

    override fun onDestroy() {
        super.onDestroy()
        compositeDisposable.dispose()
    }
}