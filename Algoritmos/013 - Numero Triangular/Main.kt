fun main() {
    val number = readln().toInt()
    println(isTriangular(number))

}

fun isTriangular(numero: Int): Boolean {
    var combination = 0
    for (counter in 1..numero) {
        combination = counter * (counter + 1) * (counter + 2)
        println("$counter * ${counter + 1} * ${counter + 2} = $combination")
        if (combination >= numero) break
    }
    return combination == numero

}