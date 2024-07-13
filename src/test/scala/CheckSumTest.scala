import model.CheckSum

class CheckSumTest extends munit.FunSuite {
  val checkSum = new CheckSum()


  /**
   * CONTENT:
   * F1: sumListOfByte() -> 10 tests
   * F2: send() -> 10 tests
   * F2: verify() -> 10 tests
   */

  // F1 TESTS

  // Name: Checksum calculation from empty data
  // Scenario: Calculate checksum when input data is empty
  test("F1.T1: Calculate Sum for Empty Data") {
    val data = ""
    val dataByte = checkSum.stringToByteList(data)
    assertEquals(checkSum.sumListOfByte(dataByte), 0:Byte)
  }

  // Name: Checksum calculation from string with a single character
  // Scenario: Calculate checksum when input data is a single character string
  test("F1.T2: Calculate Sum for Data = A") {
    val data = "A"
    val dataByte = checkSum.stringToByteList(data)
    assertEquals(checkSum.sumListOfByte(dataByte), 65: Byte)

  }

  // Name: Checksum calculation from string with a full phrase
  // Scenario: Calculate checksum when input data is a full phrase
  test("F1.T3: Calculate Sum for Data = Hello pretty cat ") {
    val data = "Hello pretty cat"
    val dataByte = checkSum.stringToByteList(data)
    assertEquals(checkSum.sumListOfByte(dataByte), 20: Byte)

  }

  // Name: Checksum calculation from string with alphabetic characters without duplicate elements
  // Scenario: Calculate checksum when input data is a string with alphabetic characters without duplicate elements
  test("F1.T4: Calculate Sum for Data = abc ") {
    val data = "abc"
    val dataByte = checkSum.stringToByteList(data)
    assertEquals(checkSum.sumListOfByte(dataByte), 38: Byte)
  }

  // Name: Checksum calculation from string with alphabetic characters with all elements duplicated
  // Scenario: Calculate checksum when input data is a string with alphabetic characters with all elements duplicated
  test("F1.T5: Calculate Sum for Data = aaaaaaaa ") {
    val data = "aaaaaaaa"
    val dataByte = checkSum.stringToByteList(data)
    assertEquals(checkSum.sumListOfByte(dataByte), 8: Byte)
  }

  // Name: Checksum calculation from string with alphabetic characters with some unique elements
  // Scenario: Calculate checksum when input data is a string with alphabetic characters with some unique elements
  test("F1.T6: Calculate Sum for Data = abaca ") {
    val data = "abaca"
    val dataByte = checkSum.stringToByteList(data)
    assertEquals(checkSum.sumListOfByte(dataByte), -24: Byte)

  }

  // Name: Checksum calculation from string with alphabetical characters in descending order
  // Scenario: Calculate checksum when input data is a string with alphabetical characters in descending order
  test("F1.T7: Calculate Sum for Data = bcdefg ") {
    val data = "bcdefg"
    val dataByte = checkSum.stringToByteList(data)
    assertEquals(checkSum.sumListOfByte(dataByte), 91: Byte)
  }

  // Name: Checksum calculation from string with alphabetical characters in ascending order
  // Scenario: Calculate checksum when input data is a string with alphabetical characters in ascending order
  test("F1.T8: Calculate Sum for Data = gfedcb ") {
    val data = "gfedcb"
    val dataByte = checkSum.stringToByteList(data)
    assertEquals(checkSum.sumListOfByte(dataByte), 91: Byte)

  }

  // Name: Checksum calculation from string with a byte sequence
  // Scenario: Calculate checksum when input data is a string with a byte sequence
  test("F1.T9: Calculate Sum for Data = 0101 ") {
    val data = "0101"
    val dataByte = checkSum.stringToByteList(data)
    assertEquals(checkSum.sumListOfByte(dataByte), -62: Byte)
  }

  // Name: Conversion of a string with extended ASCII characters to byte list
  // Scenario: Convert a string containing extended ASCII characters to a list of bytes
  test("F1.T10: Convert Extended ASCII Characters to Byte List") {
    val data = "áéíóú"
    val dataByte = checkSum.stringToByteList(data)
    val expected: List[Byte] = List(-31, -23, -19, -13, -6)
    assertEquals(expected, dataByte)
  }

  // F2 TESTS

  // Name: Checksum calculation from an empty string
  // Scenario: Calculate checksum when input data is an empty string
  test("F2.T1: Calculate Checksum for Empty String") {
    val result: List[Byte] = checkSum.send("")
    val expected: List[Byte] = List(-1)
    assertEquals(expected, result)
  }

  // Name: Checksum calculation from a single character string
  // Scenario: Calculate checksum when input data is a single character string ("H")
  test("F2.T2: Calculate checksum when input data is a single character") {
    val result: List[Byte] = checkSum.send("H")
    val expected: List[Byte] = List(72,-73)
    assertEquals(expected, result)
  }

  // Name: Checksum calculation from string with multiple characters
  // Scenario: Calculate checksum when input data is a string with multiple characters
  test("F2.T3: Calculate Checksum for Data = Hello") {
    val result: List[Byte] = checkSum.send("Hello")
    val expected: List[Byte] = List(72, 101, 108, 108, 111, 11)
    assertEquals(expected, result)
  }

  // Name: Checksum calculation from string with special characters
  // Scenario: Calculate checksum when input data contains special characters
  test("F2.T4: Calculate Checksum for Data = @#$%^&*") {
    val result: List[Byte] = checkSum.send("@#$%^&*")
    val expected: List[Byte] = List(64, 35, 36, 37, 94, 38, 42, -91)
    assertEquals(expected, result)
  }

  // Name: Checksum calculation from string with mixed characters
  // Scenario: Calculate checksum when input data contains mixed characters
  test("F2.T5: Calculate Checksum for Data = Hello!123") {
    val result: List[Byte] = checkSum.send("Hello!123")
    val expected: List[Byte] = List(72, 101, 108, 108, 111, 33, 49, 50, 51, 84)
    assertEquals(expected, result)
  }

  // Name: Checksum calculation from string with extended ASCII characters
  // Scenario: Calculate checksum when input data contains extended ASCII characters
  test("F2.T6: Calculate Checksum for Data with Extended ASCII Characters") {
    val result: List[Byte] = checkSum.send("áéíóú")
    val expected: List[Byte] = List(-31, -23, -19, -13, -6, 91)
    assertEquals(expected, result)
  }

  // Name: Checksum calculation from a string with numeric characters
  // Scenario: Calculate checksum when input data contains numeric characters
  test("F2.T7: Calculate Checksum for Data = 123456") {
    val result: List[Byte] = checkSum.send("123456")
    val expected: List[Byte] = List(49, 50, 51, 52, 53, 54, -54)
    assertEquals(expected, result)
  }

  // Name: Checksum calculation from a string with lowercase alphabetic characters
  // Scenario: Calculate checksum when input data contains lowercase alphabetic characters
  test("F2.T8: Calculate Checksum for Data = abcdef") {
    val result: List[Byte] = checkSum.send("abcdef")
    val expected: List[Byte] = List(97, 98, 99, 100, 101, 102, -86)
    assertEquals(expected, result)
  }

  // Name: Checksum calculation from a string with uppercase alphabetic characters
  // Scenario: Calculate checksum when input data contains uppercase alphabetic characters
  test("F2.T9: Calculate Checksum for Data = ABCDEF") {
    val result: List[Byte] = checkSum.send("ABCDEF")
    val expected: List[Byte] = List(65, 66, 67, 68, 69, 70, 106)
    assertEquals(expected, result)
  }

  // Name: Checksum calculation from a string with a mix of alphanumeric and special characters
  // Scenario: Calculate checksum when input data contains a mix of alphanumeric and special characters
  test("F2.T10: Calculate Checksum for Data = abc123!@#") {
    val result: List[Byte] = checkSum.send("abc123!@#")
    val expected: List[Byte] = List(97, 98, 99, 49, 50, 51, 33, 64, 35, -65)
    assertEquals(expected, result)
  }

  // F3 TESTS

  // Name: Verify checksum for a string with a single character
  // Scenario: Send a single character, calculate checksum, and verify it
  test("F3.T1: Verify Checksum for Single Character") {
    val data: List[Byte] = checkSum.send("ú")
    val result: Boolean = checkSum.verify(data)

    assert(result)
  }

  // Name: Verify checksum for a string with special characters
  // Scenario: Send a string containing special characters, calculate checksum, and verify it
  test("F3.T2: Verify Checksum for Special Characters") {
    val data: List[Byte] = checkSum.send("úÜ\"")
    val result: Boolean = checkSum.verify(data)

    assert(result)
  }

  // Name: Verify checksum for a string with a phrase
  // Scenario: Send a phrase, calculate checksum, and verify it
  test("F3.T3: Verify Checksum for Phrase") {
    val data: List[Byte] = checkSum.send("Hello pretty cat")
    val result: Boolean = checkSum.verify(data)

    assert(result)
  }

  // Name: Verify checksum for a string with repeated characters
  // Scenario: Send a string containing repeated characters, calculate checksum, and verify it
  test("F3.T4: Verify Checksum for Repeated Characters") {
    val data: List[Byte] = checkSum.send("aaaaaaaa")
    val result: Boolean = checkSum.verify(data)

    assert(result)
  }

  // Name: Verify checksum for a string with numeric characters
  // Scenario: Send a string containing numeric characters, calculate checksum, and verify it
  test("F3.T5: Verify Checksum for Numeric Characters") {
    val data: List[Byte] = checkSum.send("1234567890")
    val result: Boolean = checkSum.verify(data)

    assert(result)
  }

  // Name: Verify checksum for a string with alternating characters
  // Scenario: Send a string with alternating characters, calculate checksum, and verify it
  test("F3.T6: Verify Checksum for Alternating Characters") {
    val data: List[Byte] = checkSum.send("AbCdEfGhIjK")
    val result: Boolean = checkSum.verify(data)

    assert(result)
  }

  // Name: Verify checksum for a string with whitespace characters
  // Scenario: Send a string with whitespace characters, calculate checksum, and verify it
  test("F3.T7: Verify Checksum for Whitespace Characters") {
    val data: List[Byte] = checkSum.send("Hello World")
    val result: Boolean = checkSum.verify(data)

    assert(result)
  }

  // Name: Verify checksum for a string with a mix of uppercase and lowercase characters
  // Scenario: Send a string with a mix of uppercase and lowercase characters, calculate checksum, and verify it
  test("F3.T8: Verify Checksum for Mix of Uppercase and Lowercase Characters") {
    val data: List[Byte] = checkSum.send("aBcDeFgHiJkL")
    val result: Boolean = checkSum.verify(data)

    assert(result)
  }

  // Name: Verify checksum for a string with numeric and special characters
  // Scenario: Send a string with numeric and special characters, calculate checksum, and verify it
  test("F3.T9: Verify Checksum for Numeric and Special Characters") {
    val data: List[Byte] = checkSum.send("123!@#456&*(")
    val result: Boolean = checkSum.verify(data)

    assert(result)
  }

  // Name: Verify checksum for a string with a mix of characters including extended ASCII
  // Scenario: Send a string with a mix of characters including extended ASCII, calculate checksum, and verify it
  test("F3.T10: Verify Checksum for Mix of Characters including Extended ASCII") {
    val data: List[Byte] = checkSum.send("Mucha Confusión")
    val result: Boolean = checkSum.verify(data)

    assert(result)
  }

}