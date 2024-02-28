fun main() {
    val base = 5.0
    val altura = 3.0
    val area = calcularAreaRetangulo(base, altura)
    println("A área do retângulo com base $base e altura $altura é $area")
}
fun calcularAreaRetangulo(base: Double, altura: Double): Double {
    return base * altura
}