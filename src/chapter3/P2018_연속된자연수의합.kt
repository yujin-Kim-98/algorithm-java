package chapter3

fun main() = with(System.`in`.bufferedReader()) {

    val N = readLine().toInt()

    var count = 1
    var startIndex = 1
    var endIndex = 1
    var sum = 1

    while (endIndex != N) {
        when {
            sum == N -> {
                count++
                endIndex++
                sum += endIndex
            }

            sum < N -> {
                endIndex++
                sum += endIndex
            }

            else -> {
                sum -= startIndex
                startIndex++
            }
        }
    }

    println("result : $count")

}