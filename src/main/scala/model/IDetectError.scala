package model

trait IDetectError {
  /**
   * CONTENT:
   * 1. Send Information
   * 2. Verify Information
   * 3. Convert String to Byte List
   * 4. Convert Byte to String
   **/

  def send(s:String): List[Byte]
  
  def verify(l:List[Byte]): Boolean

  def stringToByteList(s: String): List[Byte] =
    s.map(_.toByte).toList

  def byteToBinaryString(byte: Byte): String = {
    val bit7 = (byte >> 7) & 1
    val bit6 = (byte >> 6) & 1
    val bit5 = (byte >> 5) & 1
    val bit4 = (byte >> 4) & 1
    val bit3 = (byte >> 3) & 1
    val bit2 = (byte >> 2) & 1
    val bit1 = (byte >> 1) & 1
    val bit0 = byte & 1

    s"$bit7$bit6$bit5$bit4$bit3$bit2$bit1$bit0"
  }

}
