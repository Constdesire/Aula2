fun calcularAreaTrapezio(baseMaior: Double, baseMenor: Double, altura: Double): Double {
    val area = ((baseMaior + baseMenor) * altura) / 2
    return area
}
fun main() {
    val baseMaior = 7.0
    val baseMenor = 5.0
    val altura = 3.0
    val area = calcularAreaTrapezio(baseMaior, baseMenor, altura)
    println("A área do trapézio com bases $baseMaior e $baseMenor e altura $altura é $area")
}
