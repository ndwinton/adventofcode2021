/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package aoc2021

import java.io.File
import java.io.Reader

fun main(args: Array<String>) {
    when (args[0]) {
        "1" -> runDay01()
        "2" -> runDay02()
        "3" -> runDay03()
        "4" -> runDay04()
        "5" -> runDay05()
        "6" -> runDay06()
        "7" -> runDay07()
        "8" -> runDay08()
        "9" -> runDay09()
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

fun runDay02() {
    println("Part 1: " + Day02.moveProduct(inputLines(2)))
    println("Part 2: " + Day02.moveWithAimProduct(inputLines(2)))
}

fun runDay03() {
    println("Part 1: " + Day03.gammaEpsilonProduct(inputLines(3)))
    println("Part 2: " + Day03.gasesProduct(inputLines(3)))
}

fun runDay04() {
    println("Part 1: " + Day04.findWinningScore(inputLines(4)))
    println("Part 2: " + Day04.findLastWinningScore(inputLines(4)))
}

fun runDay05() {
    println("Part 1: " + Day05.countIntersections(inputLines(5)))
    println("Part 2: " + Day05.countIntersections(inputLines(5), includeDiagonals = true))
}

fun runDay06() {
    println("Part 1: " + simulateShoal(80, Shoal(*(inputLineAsIntList(inputLines(6).first()).toIntArray()))))
    println("Part 2: " + simulateCountedShoal(256, CountedShoal(inputLineAsIntList(
        inputLines(6).first()).groupingBy { it }.eachCount().map { Pair(it.key, it.value.toLong()) }.toMap())))
}

fun runDay07() {
    println("Part 1: " + minimumAlignmentCost(inputLineAsIntList(inputLines(7).first()), ::alignmentCost))
    println("Part 2: " + minimumAlignmentCost(inputLineAsIntList(inputLines(7).first()), ::alignmentCost2))
}

fun runDay08() {
    println("Part 1: " + countSimpleOutputs(inputLines(8)))
    println("Part 2: " + sumOfAllDecoded(inputLines(8)))
}

fun runDay09() {
    println("Part 1: " + HeightMap(inputLines(9)).sumRiskLevels())
    println("Part 2: " + HeightMap(inputLines(9)).basinSizeProduct())
}

fun inputForDay(dayNum: Int): Reader = File(String.format("inputs/%02d.txt", dayNum))
    .let { if (it.exists()) it.bufferedReader() else System.`in`.bufferedReader() }

fun inputLines(dayNum: Int): List<String> = inputForDay(dayNum).readLines()

fun inputAsIntList(dayNum: Int) = inputLines(dayNum).map { it.toInt() }

fun inputLineAsIntList(line: String) = line.split(",").map { it.toInt() }

fun inputAsLongList(dayNum: Int) = inputLines(dayNum).map { it.toLong() }

fun inputAsText(dayNum: Int) = inputForDay(dayNum).readText()