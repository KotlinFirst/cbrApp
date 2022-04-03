package com.example.cbrapp.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cbrapp.R
import com.example.cbrapp.data.Currency

class JointAdapter : RecyclerView.Adapter<JointAdapter.JointViewHolder>() {

    var currencyList = listOf<Currency>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JointViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_currency, parent, false)
        return JointViewHolder(view)
    }

    override fun onBindViewHolder(holder: JointViewHolder, position: Int) {
        val currency = currencyList[position]
        holder.tvCharCode.text = currency.CharCode
        holder.tvValue.text = currency.Value.toString()
        holder.tvName.text = currency.Name
    }

    override fun getItemCount() = currencyList.size

    class JointViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        var tvCharCode = view.findViewById<TextView>(R.id.tvCharCode)
        var tvValue = view.findViewById<TextView>(R.id.tvValue)
        var tvName = view.findViewById<TextView>(R.id.tvName)
    }
}