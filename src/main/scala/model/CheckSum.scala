package model

import scala.annotation.tailrec

class CheckSum extends IDetectError,ICheckSum {
  /**
   * CONTENT:
   * 1. Send
   * 2. SumListOfByte
   * 3. Verify
   */
  

  override def send(s: String): List[Byte] =
    val bytes: List[Byte]= stringToByteList(s)
    bytes :+ (~ sumListOfByte(bytes)).toByte


  override def verify(l: List[Byte]): Boolean =
    sumListOfByte(l) == -1


  override def sumListOfByte(l: List[Byte]): Byte = {

    @tailrec
    def sum(l:List[Byte], acc:Byte): Byte =
      l match
        case Nil => acc
        case h :: t => sum(t, (acc + h).toByte )

    sum(l, 0:Byte )
  }

}