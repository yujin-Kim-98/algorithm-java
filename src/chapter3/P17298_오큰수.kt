package chapter3

import java.util.*

fun main() = with(System.`in`.bufferedReader()) {

    val n = readLine().toInt()
    val str = readLine().split(" ")

    val A = IntArray(n)
    for (i in 0 until n) {
        A[i] = str[i].toInt()
    }

    solution(n, A)

}

fun solution(
    n: Int,
    A: IntArray
) {

    val ans = IntArray(n)
    val myStack = Stack<Int>()

    myStack.push(0)

    for (i in 1 until n) {
        while (!myStack.isEmpty() && A[myStack.peek()] < A[i]) {
            ans[myStack.pop()] = A[i]
        }
        myStack.push(i)
    }

    while (!myStack.empty()) {
        ans[myStack.pop()] = -1
    }

    println(ans.joinToString(" "))

}