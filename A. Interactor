fun main() {
    val code = readLine()!!.toInt()
    val interactor = readLine()!!.toInt()
    val checker = readLine()!!.toInt()

    val verdict = when {
        interactor == 0 && code != 0 -> 3
        interactor == 0 && code == 0 -> checker
        interactor == 1 -> checker
        interactor == 4 && code != 0 -> 3
        interactor == 4 && code == 0 -> 4
        interactor == 6 -> 0
        interactor == 7 -> 1
        else -> interactor
    }
    
    println(verdict)
}
