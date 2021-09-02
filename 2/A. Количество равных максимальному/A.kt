fun main() {
    val array = mutableListOf<Int>()
    var max = 0
    var count = 0

    do {
        val num = readLine()!!.toInt()
        array.add(num)
    } while (num != 0)

    for (num in array) {
        if (num == max) {
            count++
        }

        if (num > max) {
            max = num
            count = 1
        }
        
    }

    println(count)

}
