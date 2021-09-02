fun main() {
    val numbers = readLine()!!.split(" ")
    val (stations, from, to) = numbers.map { it.toInt() }

    if (stations == 2) {
        println(0)
    } else {
        if (to > from) {
            if (to - from <= stations + from - to - 1) {
                println(to - from - 1)
            } else {
                println(stations + from - to - 1)
            }
        } else {
            if (from - to <= stations + to - from - 1) {
                println(from - to - 1)
            } else {
                println(stations + to - from - 1)
            }
        }
       
    }

}
