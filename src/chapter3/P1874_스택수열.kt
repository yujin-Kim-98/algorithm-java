//package chapter3
//
//import java.util.*
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val N = readLine().toInt()
//    val A = IntArray(N)
//
//    for (i in 0 until N) {
//        A[i] = readLine().toInt()
//    }
//
//    val result = solution(N, A)
//
//    println("result : $result")
//
//}
//
//fun solution(
//    N: Int,
//    A: IntArray
//): Any {
//
//    val result = arrayListOf<String>()
//
//    val stack = Stack<Int>()
//    var num = 1
//
//    A.map {
//
//        if (it >= num) {
//            for (i in num .. it) {
//                stack.push(i)
//                num++
//                result.add("+")
//            }
//
//            stack.pop()
//            result.add("-")
//        } else {
//            val n = stack.pop()
//
//            if (n > it) {
//                return "NO"
//            } else {
//                result.add("-")
//            }
//        }
//
//    }
//
//    return result
//}