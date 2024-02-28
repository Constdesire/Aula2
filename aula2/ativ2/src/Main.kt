fun main() {
    val base = 5.0
    val altura = 3.0
    val area = calcularAreaTriangulo(base, altura)
    println("A área do triângulo com base $base e altura $altura é $area")
}
fun calcularAreaTriangulo(base: Double, altura: Double): Double {
    return 0.5 * base * altura
}
