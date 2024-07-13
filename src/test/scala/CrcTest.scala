import model.Crc
class CrcTest extends munit.FunSuite {
  /**
   * CONTENT:
   * F1: stringToByteList() -> 14 tests
   * F2: send() -> 10 tests
   * F3: verify() -> 10 tests
   */

  val crc = new Crc()

  // F1 TESTS


  test("F1.T1: String to Byte List for Empty String"){

    val result: List[Byte] = crc.stringToByteList("")

    val expected: List[Byte] = List()

    assertEquals(expected,result)

  }

  test("F1.T2: String to Byte List for String = a "){
    val result: List[Byte] = crc.stringToByteList("a")

    val expected: List[Byte] = List(97)

    assertEquals(expected, result)

  }
  test("F1.T3: String to Byte List for String = AAA "){
    val result: List[Byte] = crc.stringToByteList("AAA")

    val expected: List[Byte] = List(65,65,65)

    assertEquals(expected, result)

  }
  test("F1.T4: String to Byte List for String = aaa"){
    val result: List[Byte] = crc.stringToByteList("aaa")

    val expected: List[Byte] = List(97,97,97)

    assertEquals(expected, result)

  }
  test("F1.T5: String to Byte List for String = aAaA "){
    val result: List[Byte] = crc.stringToByteList("aAaA")

    val expected: List[Byte] = List(97,65,97,65)

    assertEquals(expected, result)

  }
  test("F1.T6: String to Byte List for String whit only one space"){
    val result: List[Byte] = crc.stringToByteList(" ")

    val expected: List[Byte] = List(32)

    assertEquals(expected, result)

  }
  test("F1.T7: String to Byte List for String = abcd "){
    val result: List[Byte] = crc.stringToByteList("abcd")

    val expected: List[Byte] = List(97, 98, 99, 100)

    assertEquals(expected, result)

  }
  test("F1.T8: String to Byte List for String = xyz "){
    val result: List[Byte] = crc.stringToByteList("xyz")

    val expected: List[Byte] = List(120, 121, 122)

    assertEquals(expected, result)

  }
  test("F1.T9: String to Byte List for String = zzz"){
    val result: List[Byte] = crc.stringToByteList("zzz")

    val expected: List[Byte] = List(122, 122, 122)

    assertEquals(expected, result)

  }
  test("F1.T10: String to Byte List for String = zyyx"){
    val result: List[Byte] = crc.stringToByteList("zyyx")

    val expected: List[Byte] = 	List(122, 121, 121, 120)

    assertEquals(expected, result)

  }

  test("F1.T11: String to Byte List for String = áéü ") {
    val result: List[Byte] = crc.stringToByteList("áéü")

    val expected: List[Byte] = List(-31, -23, -4)

    assertEquals(expected, result)

  }
  test("F1.T12: String to Byte List for String = abc"){
    val result: List[Byte] = crc.stringToByteList("abc")

    val expected: List[Byte] = List(97, 98, 99)

    assertEquals(expected, result)

  }
  test("F1.T13: String to Byte List for String = cba"){
    val result: List[Byte] = crc.stringToByteList("cba")

    val expected: List[Byte] = List(99, 98, 97)

    assertEquals(expected, result)

  }
  test("F1.T14: String to Byte List for String = 123"){
    val result: List[Byte] = crc.stringToByteList("123")

    val expected: List[Byte] = List(49, 50, 51)

    assertEquals(expected, result)

  }
  // F2 TESTS

  test("F2.T1: Send String = ú"){
    val result : List[Byte] = crc.send("ú")
    val expected: List[Byte] = List(114,-6)

    assertEquals(expected, result)

  }
  test("F2.T2: Send String = úÜ\""){
    val result : List[Byte] = crc.send("úÜ\"")
    val expected: List[Byte] = List(31,-6,-36,34)

    assertEquals(expected, result)
  }

  test("F2.T3: Send String = bye ") {
    val result: List[Byte] = crc.send("bye")
    val expected: List[Byte] = List(53, 98, 121, 101)

    assertEquals(expected, result)
  }

  test("F2.T4: Send String = my favorite movie is star wars") {
    val result: List[Byte] = crc.send("my favorite movie is star wars")
    val expected: List[Byte] = List(78, 109, 121, 32, 102, 97, 118, 111, 114, 105, 116,
      101, 32, 109, 111, 118, 105, 101, 32, 105, 115, 32, 115, 116, 97, 114, 32, 119, 97, 114, 115)

    assertEquals(expected, result)
  }

  test("F2.T5: Send String = I Want To Sleep") {
    val result: List[Byte] = crc.send("I Want To Sleep")
    val expected: List[Byte] = List(127, 73, 32, 87, 97, 110, 116, 32, 84, 111, 32, 83, 108, 101, 101, 112)

    assertEquals(expected, result)
  }

  test("F2.T6: Send String = Batman and Robin") {
    val result: List[Byte] = crc.send("Batman and Robin")
    val expected: List[Byte] = List(95, 66, 97, 116, 109, 97, 110, 32, 97, 110, 100, 32, 82, 111, 98, 105, 110)

    assertEquals(expected, result)
  }

  test("F2.T7: Send String = love cats ") {
    val result: List[Byte] = crc.send("i love cats ")
    val expected: List[Byte] = List(34, 105, 32, 108, 111, 118, 101, 32, 99, 97, 116, 115, 32)

    assertEquals(expected, result)
  }

  test("F2.T8: Send String = i want 6 ice creams ") {
    val result: List[Byte] = crc.send("i want 6 ice creams")
    val expected: List[Byte] = List(4, 105, 32, 119, 97, 110, 116, 32,
      54, 32, 105, 99, 101, 32, 99, 114, 101, 97, 109, 115)

    assertEquals(expected, result)
  }

  test("F2.T9: Send String = hello world!") {
    val result: List[Byte] = crc.send("hello world!")
    val expected: List[Byte] = List(117, 104, 101, 108, 108, 111, 32, 119, 111, 114, 108, 100, 33)

    assertEquals(expected, result)
  }

  test("F2.T10: Send String = the password is 123456789 ") {
    val result: List[Byte] = crc.send("the password is 123456789")
    val expected: List[Byte] = List(122, 116, 104, 101, 32, 112, 97, 115,
      115, 119, 111, 114, 100, 32, 105, 115, 32, 49, 50, 51, 52, 53, 54, 55, 56, 57)

    assertEquals(expected, result)
  }

  // F3 TESTS

  test("F3.T1: verify if the string = ú was sent correctly "){
    val data : List[Byte] = crc.send("ú")
    val result : Boolean = crc.verify(data)

    assert(result)

  }
  test("F3.T2: verify if the string = was sent correctly"){
    val data : List[Byte] = crc.send("úÜ\"")
    val result : Boolean = crc.verify(data)

    assert(result)
  }

  test("F3.T3: verify if the string = 123456789 was sent correctly ") {
    val data: List[Byte] = crc.send("123456789")
    val result: Boolean = crc.verify(data)

    assert(result)
  }
  test("F3.T4: verify if the string = see you later was sent correctly ") {
    val data: List[Byte] = crc.send("see you later")
    val result: Boolean = crc.verify(data)

    assert(result)
  }
  test("F3.T5: verify if the string = abcdefghij was sent correctly ") {
    val data: List[Byte] = crc.send("abcdefghij")
    val result: Boolean = crc.verify(data)

    assert(result)
  }
  test("F3.T6: verify if the string = i love scala was sent correctly ") {
    val data: List[Byte] = crc.send("i love scala")
    val result: Boolean = crc.verify(data)

    assert(result)
  }
  test("F3.T7: verify if the string = was sent correctly ") {
    val data: List[Byte] = crc.send("i don't like tomato")
    val result: Boolean = crc.verify(data)

    assert(result)
  }
  test("F3.T8: verify if the string = All's fair in love and war. was sent correctly ") {
    val data: List[Byte] = crc.send("All's fair in love and war.")
    val result: Boolean = crc.verify(data)

    assert(result)
  }
  test("F3.T9: verify if the string =You can't judge a book by its cover was sent correctly ") {
    val data: List[Byte] = crc.send("You can't judge a book by its cover")
    val result: Boolean = crc.verify(data)

    assert(result)
  }
  test("F3.T10: verify if the string = When life gives you lemons, make lemonade. was sent correctly ") {
    val data: List[Byte] = crc.send("When life gives you lemons, make lemonade.")
    val result: Boolean = crc.verify(data)

    assert(result)
  }

}
