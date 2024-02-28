import kotlin.math.sqrt

fun calcularAreaTrianguloEquilatero(lado: Double): Double {
    val area = (lado * lado * sqrt(3.0)) / 4
    return area
}
fun main() {
    val lado = 5.0
    val area = calcularAreaTrianguloEquilatero(lado)
    println("A área do triângulo equilátero com lado é $area")
}
