package com.example.my10app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var carRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        carRecyclerView = findViewById(R.id.car_recycler_view)

        val carList: List<Car> = listOf(
            Car.SportCar("Ferrari", 500, 100, "Red"),
            Car.CityCar("Ford", 5, 10000)
        )
        carRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        carRecyclerView.addItemDecoration(
            DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
                    carRecyclerView.adapter=CarAdapter(carList)
    }
}