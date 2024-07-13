package dataAnalysis
import model.*

import java.io.*
import scala.util.Random

class DataAnalysis extends IGenerateString, ICSV:

  // CREATE THE ERROR DETECTORS
  val crc: IDetectError = new Crc()
  val checksum: IDetectError = new CheckSum()




  def generateData(): Unit =
    // CREATE DATA SETS
    // TINY 1.25 <= n < 12.5 chars
    var tinySizes = generateSizesOfString(1.25.toInt, 12.5.toInt)
    println(tinySizes)

/*    println(sizeInBits(tinySizes))*/

    val tinyStrings = listOfStringsGenerator(tinySizes)
/*    println(tinyStrings)*/
    val tinyTimesCRC = calculateTimes(crc.send,tinyStrings)
    println("CRC")
    println(tinyTimesCRC)

    val tinyTimesCHS = calculateTimes(checksum.send,tinyStrings)
    println("CHS")
    println(tinyTimesCHS)
    tinySizes = sizeInBits(tinySizes)

    print("\n\n")

    // SMALL 12.5 <= n < 1250 chars
    var smallSizes = generateSizesOfString(12.5.toInt, 1250)
    println(smallSizes)

/*    println(sizeInBits(smallSizes))*/
    val smallStrings = listOfStringsGenerator(smallSizes)
    /*println(smallStrings)*/
    val smallTimesCRC = calculateTimes(crc.send,smallStrings)
    println("CRC")
    println(smallTimesCRC)
    val smallTimesCHS = calculateTimes(checksum.send, smallStrings)
    println("CHS")
    println(smallTimesCHS)
    smallSizes = sizeInBits(smallSizes)


    print("\n\n")

    // MEDIUM 1250 <= n < 12500 chars
    var mediumSizes = generateSizesOfString(1250, 12500)
    println(mediumSizes)

/*    println(sizeInBits(mediumSizes))*/
    val mediumStrings = listOfStringsGenerator(mediumSizes)
/*    println(mediumStrings)*/
    val mediumTimesCRC = calculateTimes(crc.send,mediumStrings)
    println("CRC")
    println(mediumTimesCRC)
    val mediumTimesCHS = calculateTimes(checksum.send, mediumStrings)
    println("CHS")
    println(mediumTimesCHS)
    mediumSizes = sizeInBits(mediumSizes)


    print("\n\n")

    // BIG 12500 <= n < 125000 chars
    var bigSizes = generateSizesOfString(12500, 125000)
    println(bigSizes)

/*    println(sizeInBits(bigSizes))*/
    val bigStrings = listOfStringsGenerator(bigSizes)
    /*println(bigStrings)*/
    val bigTimesCRC = calculateTimes(crc.send,bigStrings)
    println("CRC")
    println(bigTimesCRC)
    val bigTimesCHS = calculateTimes(checksum.send, bigStrings)
    println("CHS")
    println(bigTimesCHS)
    bigSizes = sizeInBits(bigSizes)
    print("\n\n")

    writeCSV("tiny_crc", tinySizes.tail.reverse, tinyTimesCRC.tail.reverse)
    writeCSV("tiny_chs", tinySizes.tail.reverse, tinyTimesCHS.tail.reverse)
    writeCSV("small_crc", smallSizes.tail.reverse, smallTimesCRC.tail.reverse)
    writeCSV("small_chs", smallSizes.tail.reverse, smallTimesCHS.tail.reverse)
    writeCSV("medium_crc", mediumSizes.tail.reverse, mediumTimesCRC.tail.reverse)
    writeCSV("medium_chs", mediumSizes.tail.reverse, mediumTimesCHS.tail.reverse)
    writeCSV("big_crc", bigSizes.tail.reverse, bigTimesCRC.tail.reverse)
    writeCSV("big_chs", bigSizes.tail.reverse, bigTimesCHS.tail.reverse)


  def listOfStringsGenerator(sizes: List[Int]): List[String] =
    var result: List[String] = Nil
    for (i <- sizes.reverse) {

      result = stringGenerator(i) :: result
    }
    result

  def generateSizesOfString(lower: Int, upper: Int): List[Int] = {
    val listSize = 10
    val diff: Int = (upper - lower) / listSize

    var result: List[Int] = Nil
    var currentValue = lower

    for (i <- 10 to 1 by -1) {
      currentValue += diff
      result = currentValue :: result
    }
    result
  }

  def getAvg[A](generator: () => A): Long = {
    val iter = 10
    generator()
    var totalTime = 0L
    for (_ <- 1 until iter) {
      totalTime += takeTime(generator())
    }
    totalTime / (iter - 1)
  }

  def calculateTimes[A](func: String => A, list: List[String]): List[Long] = {
    list.map(data => getAvg(() => func(data)))
  }

  def takeTime[A](func: => A): Long = {
    val startTime = System.nanoTime()
    func
    val endTime = System.nanoTime()
    // Convertir de nanosegundos a milisegundos
    endTime - startTime
  }


  def sizeInBits(l: List[Int]): List[Int] =
    l.map(_ * 8)