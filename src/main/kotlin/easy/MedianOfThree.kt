package easy

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

/**
 *  https://coderun.yandex.ru/problem/median-out-of-three
 */
object MedianOfThree {
    fun run() {
        val reader = BufferedReader(InputStreamReader(System.`in`))
        val writer = BufferedWriter(OutputStreamWriter(System.out))
        val (a, b, c) = reader.readLine().split(' ')

        val intA = a.toInt()
        val intB = b.toInt()
        val intC = c.toInt()

        if (intA <= intB && intA >= intC) writer.write(a) else
        if (intA <= intC && intA >= intB) writer.write(a) else
        if (intB <= intA && intB >= intC) writer.write(b) else
        if (intB <= intC && intB >= intA) writer.write(b) else
        if (intC <= intA && intC >= intB) writer.write(c) else
        if (intC <= intB && intC >= intA) writer.write(c)

        reader.close()
        writer.close()
    }
}