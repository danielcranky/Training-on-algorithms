fun main() {
    val array = readLine()!!.trim().split(" ").map { it.toInt() }
    val arrayOfIndex2: MutableList<Int> = mutableListOf()
    val arrayOfIndex1: MutableList<Int> = mutableListOf()
    val minFromMax: MutableList<Int> = mutableListOf()

    for ((index, num) in array.withIndex()) {
        when (num) {
            1 -> arrayOfIndex1.add(index)
            2 -> arrayOfIndex2.add(index)
        }
    }

    for (num1 in arrayOfIndex1) {
        val arrayOfMin: MutableList<Int> = mutableListOf()
        var min = array.size

        for (num2 in arrayOfIndex2) {
            if (num1 >= num2) {
                if (num1 - num2 < min) {
                    min = num1 - num2
                    arrayOfMin.add(min)
                }
            } else {
                if (num2 - num1 < min) {
                    min = num2 - num1
                    arrayOfMin.add(min)
                }
            }
        }

        minFromMax.add(arrayOfMin.min()!!)
    }

    println(minFromMax.max())

}
