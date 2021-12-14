package com.example.my10app

sealed class Car (open val brand: String){
    class SportCar(
        override val brand: String,
        val speed: Int,
        val drift: Int,
        val color:String
    ) :Car(brand)

    class CityCar(
        override val brand: String,
        val comfortlevel: Int,
        val price: Int
    ) : Car(brand)
}

