import kotlin.random.Random

fun main() {
    Array(20) { it }.map { Random.nextInt(0,100) }.sorted().forEach { print("$it ") }
}
