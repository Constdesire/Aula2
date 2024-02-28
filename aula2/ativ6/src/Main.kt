import kotlin.math.PI

fun calcularAreaCircunferencia(raio: Double): Double {
    val area = PI * raio * raio
    return area
}
fun main() {
    val raio = 5.0
    val area = calcularAreaCircunferencia(raio)
    println("A área da circunferência com raio $raio é $area")
}
