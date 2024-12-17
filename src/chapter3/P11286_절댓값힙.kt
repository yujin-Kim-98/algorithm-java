package chapter3

import java.util.*

// 백준 11286
fun main() = with(System.`in`.bufferedReader()) {

    val N = readLine().toInt()

    val myQueue = PriorityQueue<Int>(kotlin.Comparator { o1, o2 ->
        val firstAbs = Math.abs(o1)
        val secondAbs = Math.abs(o2)

        if (firstAbs == secondAbs) {
            when (o1 > o2) {
                true -> 1
                false -> -1
            }
        } else {
            firstAbs - secondAbs
        }
    })

    for (i in 0 until N) {
        val request = readLine().toInt()

        if (request == 0) {
            when (myQueue.isEmpty()) {
                true -> println("0")
                false -> println(myQueue.poll())
            }
        } else {
            myQueue.add(request)
        }
    }

}