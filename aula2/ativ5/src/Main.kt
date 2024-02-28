import kotlin.math.sqrt

fun calcularAreaTrianguloEscaleno(ladoA: Double, ladoB: Double, ladoC: Double): Double {
    val semiPerimetro = (ladoA + ladoB + ladoC) / 2
    val area = sqrt(semiPerimetro * (semiPerimetro - ladoA) * (semiPerimetro - ladoB) * (semiPerimetro - ladoC))
    return area
}
fun main() {
    val ladoA = 3.0
    val ladoB = 4.0
    val ladoC = 5.0
    val area = calcularAreaTrianguloEscaleno(ladoA, ladoB, ladoC)
    println("A área do triângulo escaleno com lados $ladoA, $ladoB e $ladoC é $area")
}
