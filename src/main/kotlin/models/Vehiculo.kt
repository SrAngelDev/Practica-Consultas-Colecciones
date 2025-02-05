package srangeldev.models

data class Vehiculo(
    val marca: String,
    val modelo: String,
    val añoFabricacion: Int,
    val color: String,
    val consumo: Double, // litros cada 100 km
    val kilometraje: Int
)
