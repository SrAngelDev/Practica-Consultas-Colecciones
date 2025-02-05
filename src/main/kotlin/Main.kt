package srangeldev

import srangeldev.models.Vehiculo

fun main() {
    val vehiculos = listOf(
        Vehiculo("Toyota", "Corolla", 2018, "Rojo", 6.5, 85000),
        Vehiculo("Ford", "Fiesta", 2020, "Azul", 5.8, 40000),
        Vehiculo("Honda", "Civic", 2017, "Negro", 7.0, 120000),
        Vehiculo("Chevrolet", "Onix", 2021, "Blanco", 5.3, 25000),
        Vehiculo("Volkswagen", "Golf", 2019, "Gris", 6.8, 60000),
        Vehiculo("Nissan", "Versa", 2016, "Plateado", 6.2, 130000),
        Vehiculo("Hyundai", "Tucson", 2022, "Rojo", 7.5, 15000),
        Vehiculo("Mazda", "3", 2015, "Azul", 6.0, 140000),
        Vehiculo("Mazda", "4", 2012, "Negro", 7.0, 70000)
    )

    println("Encuentra todos los vehículos que tengan un consumo menor a 6 litros cada 100 km.")
    println(vehiculos.filter { it.consumo < 6.0 })
    println()

    println("Filtra los vehículos cuyo año de fabricación sea posterior a 2018.")
    println(vehiculos.filter { it.añoFabricacion > 2018 })
    println()

    println("Obtén solo los vehículos de color rojo.")
    println(vehiculos.filter { it.color == "Rojo" })
    println()

    println("Obtén una lista de todas las marcas de los vehículos sin repetir.")
    println(vehiculos.map { it.marca }.distinct())
    println()

    println("Crea una lista de cadenas con el formato \"Marca Modelo - Año\" para cada vehículo.")
    println(vehiculos.map { "${it.marca} ${it.modelo} - ${it.añoFabricacion}" })
    println()

    println("Ordena los vehículos por año de fabricación de más nuevo a más antiguo.")
    println(vehiculos.sortedByDescending { it.añoFabricacion }.toList())
    println()

    println("Ordena los vehículos por consumo de menor a mayor.")
    println(vehiculos.sortedBy { it.consumo }.toList())
    println()

    println("Agrupa los vehículos por color.")
    println(vehiculos.groupBy { it.color })
    println()

    println("Agrupa los vehículos por marca y muestra cuántos hay de cada una.")
    println(vehiculos.groupingBy { it.marca }.eachCount())
    println()

    println("Calcula el promedio de consumo de los vehículos.")
    println(vehiculos.map { it.consumo }.average())
    println()

    println("Encuentra el vehículo con mayor kilometraje.")
    println(vehiculos.maxBy { it.kilometraje })
    println()

    println("Calcula el total de kilómetros recorridos por todos los vehículos.")
    println(vehiculos.sumOf { it.kilometraje })
    println()

    println("Encuentra los vehículos cuyo consumo sea menor a 6.5 litros y tengan menos de 100,000 km recorridos.")
    println(vehiculos.filter { it.consumo < 6.5 && it.kilometraje < 100000 })
    println()

    println("Obtén los vehículos fabricados entre 2015 y 2020 que no sean de color negro ni blanco.")
    println(vehiculos.filter { it.color != "Blanco" && it.color != "Negro" && it.añoFabricacion > 2015 && it.añoFabricacion < 2020 })
    println()

    println("Filtra los vehículos cuya marca comience con la letra \"T\" o \"H\" y que tengan más de 50,000 km.")
    println(vehiculos.filter { it.marca.startsWith("H") || it.marca.startsWith("T") && it.kilometraje > 50000 })
    println()
}