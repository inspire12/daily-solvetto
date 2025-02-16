package solver.beakjoon.queueq

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

/**
 * ANA는 회문이야
 * https://www.acmicpc.net/problem/32401
 */

fun solution(): Int = with(BufferedReader(InputStreamReader(System.`in`))) {
    val lineCount = readLine().toInt()
    val st = readLine()

    val queue = LinkedList<String>()
    var c = 0
    for (i in 0 until lineCount) {
        val s = st[i].toString()
        if (s == "A") {
            if (queue.isEmpty()) {
                queue.push(s)
            } else {
                val n = queue.pop()
                if (n == "N") {
                    c++
                    queue.push(s)
                }
                else { // (n == "A")
                    queue.push(s)
                }
            }
        } else if (s == "N") {
            if (queue.isEmpty()) {
                continue
            }
            val n = queue.pop()
            if (n == "A") {
                queue.push(s)
            }
        }
    }
    return c
}

fun main() {
    print(solution())
}