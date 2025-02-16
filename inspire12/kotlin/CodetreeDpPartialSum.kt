import java.io.*
import java.util.*

/**
 * @link: https://www.codetree.ai/trails/complete/curated-cards/intro-max-of-partial-sum/introduction
 */
fun main() {
    solution1_1()
}


fun solution1_1(): Unit = with(BufferedReader(InputStreamReader(System.`in`))) {
    /**
     * sum[start][end] = sum[0][end] - sum[0][start]
     */
    val lineCount = readLine().toInt()
    val st = StringTokenizer(readLine())

    var currentSum = st.nextToken().toInt()
    var maxSum = currentSum


    for (i in 1 until lineCount) {
        val num = st.nextToken().toInt()
        currentSum = maxOf(num, currentSum + num)
        maxSum = maxOf(maxSum, currentSum)
    }
    println(maxSum)
}
