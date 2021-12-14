package com.example.my10app

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SportCarViewHilder(itemView:View): RecyclerView.ViewHolder(itemView) {
    private val brandTextView: TextView= itemView.findViewById(R.id.brand_text_view)
    private val speedTextView: TextView= itemView.findViewById(R.id.speed_text_view)
    private val driftTextView: TextView= itemView.findViewById(R.id.drift_level_text_view)
    private val colorTextView: TextView= itemView.findViewById(R.id.color_text_view)
    fun bind(sportCar:Car.SportCar){
        brandTextView.text=sportCar.brand
        speedTextView.text="Speed - ${sportCar.speed}"
        driftTextView.text="Drift -${sportCar.drift}"
        colorTextView.text="Color - ${sportCar.color}"
    }
}