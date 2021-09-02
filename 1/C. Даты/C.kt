fun main() {
    val numbers = readLine()!!.split(" ")
    val (x, y, z) = numbers.map { it.toInt() }

    val result = when {
        x > 12 && y <= 12 -> 1
        x <= 12 && y > 12 -> 1
        x == y -> 1
        else -> 0
    }

    println(result)

}
