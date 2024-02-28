import kotlin.math.sqrt

fun calcularAreaTrianguloIsosceles(base: Double, lado: Double): Double {
    val altura = sqrt(lado * lado - (base / 2) * (base / 2))
    val area = (base * altura) / 2
    return area
}

fun main() {
    val base = 6.0
    val lado = 5.0
    val area = calcularAreaTrianguloIsosceles(base, lado)
    println("A área do triângulo isósceles com base $base e lado $lado é $area")
}
