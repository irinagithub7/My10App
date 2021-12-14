package com.example.my10app

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CityCarViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {
    private val brandTextView: TextView = itemview.findViewById(R.id.brand_text_view)
    private val comfortLevelTextView: TextView = itemview.findViewById(R.id.comfort_level_text_view)
    private val priceTextView: TextView = itemview.findViewById(R.id.price_text_view)

    fun bind(cityCar: Car.CityCar) {
        brandTextView.text = "Brand - ${cityCar.brand}"
        comfortLevelTextView.text = "ComfortLevel- ${cityCar.comfortlevel.toString()}"
        priceTextView.text = "${cityCar.price}"
    }
}