fun main() {
    val count = readLine()!!.toInt()
    val numbers = readLine()!!.split(" ")
    val cordinates = numbers.map { it.toInt() }

    val point = count / 2

    println(cordinates[point])

}
