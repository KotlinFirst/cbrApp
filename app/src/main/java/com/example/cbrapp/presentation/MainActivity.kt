package com.example.cbrapp.presentation

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.cbrapp.R

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: CurrencyViewModel
    private lateinit var adapter: JointAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupRecyclerView()
        viewModel = ViewModelProvider(this)[CurrencyViewModel::class.java]
        viewModel.currencyList.observe(this) {
            adapter.currencyList = it
            Log.d("TEST", it.toString())
        }
    }

    private fun setupRecyclerView() {
        val rvAppCrb = findViewById<RecyclerView>(R.id.rvAppCrb)
        adapter = JointAdapter()
        rvAppCrb.adapter = adapter
    }
}

