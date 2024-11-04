package chapter3

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(System.`in`.bufferedReader()) {

    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))

    var stringTokenizer = StringTokenizer(bufferedReader.readLine())
    val suNo = Integer.parseInt(stringTokenizer.nextToken())
    val quizNo = Integer.parseInt(stringTokenizer.nextToken())

    val S = IntArray(suNo + 1)
    stringTokenizer = StringTokenizer(bufferedReader.readLine())

    for (i in 1 .. suNo) {
        S[i] = S[i - 1] + Integer.parseInt(stringTokenizer.nextToken())
    }

    for (q in 1 .. quizNo) {
        stringTokenizer = StringTokenizer(bufferedReader.readLine())
        val i = Integer.parseInt(stringTokenizer.nextToken())
        val j = Integer.parseInt(stringTokenizer.nextToken())
        println(S[j] - S[i - 1])
    }

}