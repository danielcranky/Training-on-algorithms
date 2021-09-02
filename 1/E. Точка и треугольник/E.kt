fun main() {
    val d = readLine()!!.toInt()
    val (x, y) = readLine()!!.split(" ").map { it.toInt() }

    val result = when {
    x in 0..d && y in 0..(d - x) -> 0
    (x <= 0 && y <= 0) || (x < 0 && y <= (d + 1) / 2) || (y < 0 && x <= (d + 1) / 2) -> 1
    (x >= d && y < 0) || (x >= d && y <= d) || (x <= d && y <= x) -> 2
    (y >= d && x < 0) || (y >= d && x <= d) || (y <= d && x < y) -> 3
    else -> error("Что то пошло не так")
	}
    
    println(result)

}
