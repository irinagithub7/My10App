package com.example.my10app

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import java.lang.Exception

class CarAdapter(private val carList: List<Car>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(viewType, parent, false)
        return when (viewType) {
            R.layout.city_car_list_item -> CityCarViewHolder(itemView)
            R.layout.sport_car_list_view -> SportCarViewHilder(itemView)
            else -> throw Exception()
        }

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val car = carList[position]

        when (holder) {
            is SportCarViewHilder -> holder.bind(car as Car.SportCar)
            is CityCarViewHolder -> holder.bind(car as Car.CityCar)
        }

    }

    override fun getItemCount(): Int {
        return carList.size
    }

    override fun getItemViewType(position: Int): Int {
        return when (carList[position]) {
            is Car.CityCar -> R.layout.city_car_list_item
            is Car.SportCar -> R.layout.sport_car_list_view
        }
    }
}