package model

trait ICrc:

  def getCrc(l: List[Byte]): Byte

  def isLastBit0(byte: Byte): Boolean

  def replaceLastBit(x: Byte, y: Byte, pos: Int): Byte

  def getBit(byte: Byte, position: Int): Int

  def fistDivide(dividend: Byte): Byte

  def middleDivide(l: List[Byte], r: Byte): Byte
  
  def divide(head: Byte, r: Byte, numOfPos:Int): Byte