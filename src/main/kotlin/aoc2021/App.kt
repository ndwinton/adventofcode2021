/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package aoc2021

import java.io.File
import java.io.Reader

fun main(args: Array<String>) {
    when (args[0]) {
        "1" -> runDay01()
        else -> println("""
            https://adventofcode.com/2021/
            
            Usage: App day-number
            
            Inputs are assumed to be in 'inputs/NN.txt' where 'NN' is the 2-digit day number.
            If the file isn't present, it reads from stdin instead.
            """.trimIndent())
    }
}

fun runDay01() {
    println("Part 1: " + Day01.numberOfIncreases(inputAsIntList(1)))
    println("Part 2: " + Day01.numberOfIncreases(inputAsIntList(1), window = 3))
}

fun inputForDay(dayNum: Int): Reader = File(String.format("inputs/%02d.txt", dayNum))
    .let { if (it.exists()) it.bufferedReader() else System.`in`.bufferedReader() }

fun inputLines(dayNum: Int): List<String> = inputForDay(dayNum).readLines()

fun inputAsIntList(dayNum: Int) = inputLines(dayNum).map { it.toInt() }

fun inputAsLongList(dayNum: Int) = inputLines(dayNum).map { it.toLong() }

fun inputAsText(dayNum: Int) = inputForDay(dayNum).readText()