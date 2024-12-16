package chapter3

import java.util.*

fun main() = with(System.`in`.bufferedReader()) {

    val scanner = Scanner(System.`in`)

    val N = scanner.nextInt()

    val queue: Queue<Int> = LinkedList()
    for (i in 1 .. N) {
        queue.add(i)
    }

    while (queue.size > 1) {
        queue.poll()
        queue.add(queue.poll())
    }

    println(queue.joinToString())

}