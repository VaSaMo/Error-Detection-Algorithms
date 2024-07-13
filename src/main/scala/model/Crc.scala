package model

import scala.annotation.tailrec

class Crc extends IDetectError, ICrc {

  private val div: Byte = -7

  override def send(s: String): List[Byte] = {
    val data: List[Byte] = stringToByteList(s)
    val crc: Byte = getCrc(data)
    crc :: data
  }

  override def verify(l: List[Byte]): Boolean = {
    val crc: Byte = l.head
    val fr = fistDivide(l.tail.head)
    val middleR = middleDivide(l.tail.tail, fr)
    divide(crc, middleR, 6) == 0
  }

  override def getCrc(l: List[Byte]): Byte = {
    val fr = fistDivide(l.head)
    val middleR = middleDivide(l.tail, fr)
    divide(0, middleR, 6)
  }

  override def isLastBit0(byte: Byte): Boolean = ((byte >> 7) & 1) == 0

  override def replaceLastBit(x: Byte, y: Byte, pos: Int): Byte = {
    val bit7 = (x >> 6) & 1
    val bit6 = (x >> 5) & 1
    val bit5 = (x >> 4) & 1
    val bit4 = (x >> 3) & 1
    val bit3 = (x >> 2) & 1
    val bit2 = (x >> 1) & 1
    val bit1 = x & 1
    val bit0 = getBit(y, pos)
    val binaryString = s"$bit7$bit6$bit5$bit4$bit3$bit2$bit1$bit0"
    Integer.parseInt(binaryString, 2).toByte
  }

  override def getBit(byte: Byte, position: Int): Int = {
    val mask = 1 << position
    (byte & mask) >> position
  }

  override def fistDivide(dividend: Byte): Byte = {
    if (isLastBit0(dividend)) dividend
    else (dividend ^ div).toByte
  }

  @tailrec
  final override def middleDivide(l: List[Byte], r: Byte): Byte = {
    l match {
      case Nil => r
      case h :: tail =>
        val newR = divide(h, r, 7)
        middleDivide(tail, newR)
    }
  }

  override def divide(head: Byte, r: Byte, numOfPos: Int): Byte = {
    @tailrec
    def run(r: Byte, pos: Int): Byte = {
      if (pos >= 0) {
        val newR: Byte = replaceLastBit(r, head, pos)
        if (isLastBit0(newR)) {
          run(newR, pos - 1)
        } else run((newR ^ div).toByte, pos - 1)
      } else r
    }
    run(r, numOfPos)
  }
}
