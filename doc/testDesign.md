**Team Members:**



* Mariana Agudelo Salazar (A00398722)
* Gabriel Escobar (A00399291)
* Vanessa Sánchez Morales (A00397949)
* Natalia Vargas  (A00398706)

**TEST DOCUMENTATION**

**_Problem 1: CheckSum_**

**Sceneries Set Up (SumListOfByte Method):**


<table>
  <tr>
   <td><strong>Name</strong>
   </td>
   <td><strong>Scenario</strong>
   </td>
  </tr>
  <tr>
   <td>setUp1
   </td>
   <td>Empty data (“”)
   </td>
  </tr>
  <tr>
   <td>setUp2
   </td>
   <td>String with a upper case single character (“A”)
   </td>
  </tr>
  <tr>
   <td>setUp3
   </td>
   <td>Full Phrase (“Hello pretty cat”)
   </td>
  </tr>
  <tr>
   <td>setUp4
   </td>
   <td>String with alphabetic characters without duplicate elements (“abc”)
   </td>
  </tr>
  <tr>
   <td>setUp5
   </td>
   <td>String with alphabetic characters with all elements duplicated (“aaaaaaaa”)
   </td>
  </tr>
  <tr>
   <td>setUp6
   </td>
   <td>String with alphabetic characters with some unique elements (“abaca”)
   </td>
  </tr>
  <tr>
   <td>setUp7
   </td>
   <td>String with alphabetical characters in descending order (“bcdefg”)
   </td>
  </tr>
  <tr>
   <td>setUp8
   </td>
   <td>String with alphabetical characters in ascending order (“gfedcb”)
   </td>
  </tr>
  <tr>
   <td>setUp9
   </td>
   <td>String is a byte sequence (“0101”)
   </td>
  </tr>
  <tr>
   <td>setUp10
   </td>
   <td>String with extended ASCII characters ("áéíóú")
   </td>
  </tr>
</table>


**Sceneries Set Up (send Method):**


<table>
  <tr>
   <td>setUp11
   </td>
   <td>Empty data (“”)
   </td>
  </tr>
  <tr>
   <td>setUp12
   </td>
   <td>Single character (“H”)
   </td>
  </tr>
  <tr>
   <td>setUp13
   </td>
   <td>String with multiple characters (“Hello”)
   </td>
  </tr>
  <tr>
   <td>setUp14
   </td>
   <td>String with special characters (“@#$%^&*”)
   </td>
  </tr>
  <tr>
   <td>setUp15
   </td>
   <td>String with mixed characters (“Hello!123”)
   </td>
  </tr>
  <tr>
   <td>setUp16
   </td>
   <td>String with extended ASCII characters (“áéíóú”)
   </td>
  </tr>
  <tr>
   <td>setUp17
   </td>
   <td>String with multiple numeric characters (“123456”)
   </td>
  </tr>
  <tr>
   <td>setUp18
   </td>
   <td>String with lowercase alphabetic characters (“abcdf”)
   </td>
  </tr>
  <tr>
   <td>setUp19
   </td>
   <td>String with uppercase alphabetic characters (“ABCDF”)
   </td>
  </tr>
  <tr>
   <td>setUp20
   </td>
   <td>String with a mix of alphanumeric and special characters (“abc123!@#”)
   </td>
  </tr>
</table>


**Sceneries Set Up (verify Method):**


<table>
  <tr>
   <td>setUp21
   </td>
   <td>String with a single character (ú)
   </td>
  </tr>
  <tr>
   <td>setUp22
   </td>
   <td>String with special characters (úÜ)
   </td>
  </tr>
  <tr>
   <td>setUp23
   </td>
   <td>String with a phrase(“Hello pretty cat”)
   </td>
  </tr>
  <tr>
   <td>setUp24
   </td>
   <td>String with repeated characters (“aaaaaaaa”)
   </td>
  </tr>
  <tr>
   <td>setUp25
   </td>
   <td>String with numeric characters (“1234567890”)
   </td>
  </tr>
  <tr>
   <td>setUp26
   </td>
   <td>String with alternating characters(“AbCdEfGhIjK”)
   </td>
  </tr>
  <tr>
   <td>setUp27
   </td>
   <td>String with a space (“Hello World”)
   </td>
  </tr>
  <tr>
   <td>setUp28
   </td>
   <td>String with a mix of uppercase and lowercase characters (“aBcDeFgHiJkL”)
   </td>
  </tr>
  <tr>
   <td>setUp29
   </td>
   <td>String with numeric and special characters (“123!@#456&*”)
   </td>
  </tr>
  <tr>
   <td>setUp30
   </td>
   <td>String with a mix of characters (“Mucha Confusión”
   </td>
  </tr>
</table>


**Test Cases Design:**


<table>
  <tr>
   <td><strong>Method</strong>
   </td>
   <td><strong>Scenario</strong>
   </td>
   <td><strong>Entry Values</strong>
   </td>
   <td><strong>Expected Result</strong>
   </td>
  </tr>
  <tr>
   <td>sumListOfByte()
   </td>
   <td>setUp1
   </td>
   <td>“”
   </td>
   <td>0
   </td>
  </tr>
  <tr>
   <td>sumListOfByte()
   </td>
   <td>setUp2
   </td>
   <td>“A”
   </td>
   <td>65
   </td>
  </tr>
  <tr>
   <td>sumListOfByte()
   </td>
   <td>setUp3
   </td>
   <td>“Hello pretty cat”
   </td>
   <td>20
   </td>
  </tr>
  <tr>
   <td>sumListOfByte()
   </td>
   <td>setUp4
   </td>
   <td>“abc”
   </td>
   <td>38
   </td>
  </tr>
  <tr>
   <td>sumListOfByte()
   </td>
   <td>setUp5
   </td>
   <td>“aaaaaaa”
   </td>
   <td>8
   </td>
  </tr>
  <tr>
   <td>sumListOfByte()
   </td>
   <td>setUp6
   </td>
   <td>“abaca”
   </td>
   <td>-24
   </td>
  </tr>
  <tr>
   <td>sumListOfByte()
   </td>
   <td>setUp7
   </td>
   <td>“bcdefg”
   </td>
   <td>91
   </td>
  </tr>
  <tr>
   <td>sumListOfByte()
   </td>
   <td>setUp8
   </td>
   <td>“gfedcb”
   </td>
   <td>91
   </td>
  </tr>
  <tr>
   <td>sumListOfByte()
   </td>
   <td>setUp9
   </td>
   <td>“0101”
   </td>
   <td>-62
   </td>
  </tr>
  <tr>
   <td>sumListOfByte()
   </td>
   <td>setUp10
   </td>
   <td>“áéíóú”
   </td>
   <td>List(-31, -23, -19, -13, -6)
   </td>
  </tr>
  <tr>
   <td>send()
   </td>
   <td>setUp11
   </td>
   <td>“”
   </td>
   <td>List(-1)
   </td>
  </tr>
  <tr>
   <td>send()
   </td>
   <td>setUp12
   </td>
   <td>“H”
   </td>
   <td>List(72,-73)
   </td>
  </tr>
  <tr>
   <td>send()
   </td>
   <td>setUp13
   </td>
   <td>“Hello”
   </td>
   <td>List(72, 101, 108, 108, 111, 11)
   </td>
  </tr>
  <tr>
   <td>send()
   </td>
   <td>setUp14
   </td>
   <td>“@#$%^&*”
   </td>
   <td>List(64, 35, 36, 37, 94, 38, 42, -91)
   </td>
  </tr>
  <tr>
   <td>send()
   </td>
   <td>setUp15
   </td>
   <td>“Hello!123”
   </td>
   <td>List(72, 101, 108, 108, 111, 33, 49, 50, 51, 84)
   </td>
  </tr>
  <tr>
   <td>send()
   </td>
   <td>setUp16
   </td>
   <td>(áéíóú)
   </td>
   <td>List(72, 101, 108, 108, 111, 33, 49, 50, 51, 84)
   </td>
  </tr>
  <tr>
   <td>send()
   </td>
   <td>setUp17
   </td>
   <td>(“123456”)
   </td>
   <td>List(49, 50, 51, 52, 53, 54, -54)
   </td>
  </tr>
  <tr>
   <td>send()
   </td>
   <td>setUp18
   </td>
   <td>(“abcdf”)
   </td>
   <td>List(97, 98, 99, 100, 101, 102, -86)
   </td>
  </tr>
  <tr>
   <td>send()
   </td>
   <td>setUp19
   </td>
   <td>(“ABCDF”)
   </td>
   <td>List(65, 66, 67, 68, 69, 70, 106)
   </td>
  </tr>
  <tr>
   <td>send()
   </td>
   <td>setUp20
   </td>
   <td>(“abc123!@#”)
   </td>
   <td>List(97, 98, 99, 49, 50, 51, 33, 64, 35, -65)
   </td>
  </tr>
  <tr>
   <td>verify() 
   </td>
   <td>setUp21
   </td>
   <td>(“ú”)
   </td>
   <td>true
   </td>
  </tr>
  <tr>
   <td>verify() 
   </td>
   <td>setUp22
   </td>
   <td>(“úÜ”)
   </td>
   <td>true
   </td>
  </tr>
  <tr>
   <td>verify() 
   </td>
   <td>setUp23
   </td>
   <td>(“Hello pretty cat”)
   </td>
   <td>true
   </td>
  </tr>
  <tr>
   <td>verify() 
   </td>
   <td>setUp24
   </td>
   <td>(“aaaaaaaa”)
   </td>
   <td>true
   </td>
  </tr>
  <tr>
   <td>verify() 
   </td>
   <td>setUp25
   </td>
   <td>(“1234567890”)
   </td>
   <td>true
   </td>
  </tr>
  <tr>
   <td>verify() 
   </td>
   <td>setUp26
   </td>
   <td>(“AbCdEfGhIjK”)
   </td>
   <td>true
   </td>
  </tr>
  <tr>
   <td>verify() 
   </td>
   <td>setUp27
   </td>
   <td>(“Hello World”)
   </td>
   <td>true
   </td>
  </tr>
  <tr>
   <td>verify() 
   </td>
   <td>setUp28
   </td>
   <td>(“aBcDeFgHiJkL”)
   </td>
   <td>true
   </td>
  </tr>
  <tr>
   <td>verify() 
   </td>
   <td>setUp29
   </td>
   <td>(“123!@#456&*”)
   </td>
   <td>true
   </td>
  </tr>
  <tr>
   <td>verify() 
   </td>
   <td>setU30
   </td>
   <td>(“Mucha Confusión”
   </td>
   <td>true
   </td>
  </tr>
</table>


**_Problem 2: Cyclic Redundancy Check (CRC)_**

**Sceneries Set Up:**


<table>
  <tr>
   <td><strong>Name</strong>
   </td>
   <td><strong>Scenario</strong>
   </td>
  </tr>
  <tr>
   <td>setUp1
   </td>
   <td>Empty data
   </td>
  </tr>
  <tr>
   <td>setUp2
   </td>
   <td>String with a single character (“a”)
   </td>
  </tr>
  <tr>
   <td>setUp3
   </td>
   <td>String with capital letters (“AAA”)
   </td>
  </tr>
  <tr>
   <td>setUp4
   </td>
   <td>String with lowercase letters (“aaa”)
   </td>
  </tr>
  <tr>
   <td>setUp5
   </td>
   <td>String with lowercase and capital letters (“aAaA”)
   </td>
  </tr>
  <tr>
   <td>setUp6
   </td>
   <td>String with a only a white space 
   </td>
  </tr>
  <tr>
   <td>setUp7
   </td>
   <td>Single String (“abcd”)
   </td>
  </tr>
  <tr>
   <td>setUp8
   </td>
   <td>Single String (“xyz”)
   </td>
  </tr>
  <tr>
   <td>setUp9
   </td>
   <td>String with alphabetic characters with all elements duplicated (“zzz”)
   </td>
  </tr>
  <tr>
   <td>setUp10
   </td>
   <td>String with alphabetic characters with some unique elements (“zyyx”)
   </td>
  </tr>
  <tr>
   <td>setUp11
   </td>
   <td>String with special characters (“áéü”)
   </td>
  </tr>
  <tr>
   <td>setUp12
   </td>
   <td>String with alphabetical characters in descending order (“abc”)
   </td>
  </tr>
  <tr>
   <td>setUp13
   </td>
   <td>String with alphabetical characters in ascending order (“cba”)
   </td>
  </tr>
  <tr>
   <td>setUp14
   </td>
   <td>String with numbers (“123”)
   </td>
  </tr>
  <tr>
   <td>setUp15
   </td>
   <td>String with special character (“ú”)
   </td>
  </tr>
  <tr>
   <td>setUp16
   </td>
   <td>String with 2 special characters (“úÜ"”)
   </td>
  </tr>
  <tr>
   <td>setUp17
   </td>
   <td>Word in lower case (“bye”)
   </td>
  </tr>
  <tr>
   <td>setUp18
   </td>
   <td>Phrase in lower case (“my favorite movie is star wars”)
   </td>
  </tr>
  <tr>
   <td>setUp19
   </td>
   <td>Phrase with capital and lower case letters (“I Want To Sleep”)
   </td>
  </tr>
  <tr>
   <td>setUp20
   </td>
   <td>Phrase with capital and lower case letters (“Batman and Robin”)
   </td>
  </tr>
  <tr>
   <td>setUp21
   </td>
   <td>Phrase in lower case (“love cats”)
   </td>
  </tr>
  <tr>
   <td>setUp22
   </td>
   <td>Phrase in lower case (“i want 6 ice creams”)
   </td>
  </tr>
  <tr>
   <td>setUp23
   </td>
   <td>Phrase in lower case and special character (“hello world!”)
   </td>
  </tr>
  <tr>
   <td>setUp24
   </td>
   <td>Phrase with letters and numbers (“the password is 123456789”)
   </td>
  </tr>
  <tr>
   <td>setUp25
   </td>
   <td>String with more numbers (“123456789”)
   </td>
  </tr>
  <tr>
   <td>setUp26
   </td>
   <td>Phrase in lower case (“see you later”)
   </td>
  </tr>
  <tr>
   <td>setUp27
   </td>
   <td>String of organized letters (“abcdefghij”)
   </td>
  </tr>
  <tr>
   <td>setUp28
   </td>
   <td>Phrase in lower case (“i love scala”)
   </td>
  </tr>
  <tr>
   <td>setUp29
   </td>
   <td>Phrase in lower case (“i don't like tomato”)
   </td>
  </tr>
  <tr>
   <td>setUp30
   </td>
   <td>Phrase (“All's fair in love and war”)
   </td>
  </tr>
  <tr>
   <td>setUp31
   </td>
   <td>Long phrase (“You can't judge a book by its cover”)
   </td>
  </tr>
  <tr>
   <td>setUp32
   </td>
   <td>Long phrase with punctuation marks  (“When life gives you lemons, make lemonade.”)
   </td>
  </tr>
</table>


**Test Cases Design:**


<table>
  <tr>
   <td><strong>Method</strong>
   </td>
   <td><strong>Scenario</strong>
   </td>
   <td><strong>Entry Values</strong>
   </td>
   <td><strong>Expected Result</strong>
   </td>
  </tr>
  <tr>
   <td>stringToByteList()
   </td>
   <td>setUp1
   </td>
   <td>“”
   </td>
   <td>List()
   </td>
  </tr>
  <tr>
   <td>stringToByteList()
   </td>
   <td>setUp2
   </td>
   <td>“a”
   </td>
   <td>List(97)
   </td>
  </tr>
  <tr>
   <td>stringToByteList()
   </td>
   <td>setUp3
   </td>
   <td>“AAA”
   </td>
   <td>List(65, 65, 65)
   </td>
  </tr>
  <tr>
   <td>stringToByteList()
   </td>
   <td>setUp4
   </td>
   <td>“aaa”
   </td>
   <td>List(97, 97, 97)
   </td>
  </tr>
  <tr>
   <td>stringToByteList()
   </td>
   <td>setUp5
   </td>
   <td>“aAaA”
   </td>
   <td>List(97, 65, 97, 65)
   </td>
  </tr>
  <tr>
   <td>stringToByteList()
   </td>
   <td>setUp6
   </td>
   <td>“ ”
   </td>
   <td>List(32)
   </td>
  </tr>
  <tr>
   <td>stringToByteList()
   </td>
   <td>setUp7
   </td>
   <td>“abcd”
   </td>
   <td>List(97, 98, 99, 100)
   </td>
  </tr>
  <tr>
   <td>stringToByteList()
   </td>
   <td>setUp8
   </td>
   <td>“xyz”
   </td>
   <td>List(120, 121, 122)
   </td>
  </tr>
  <tr>
   <td>stringToByteList()
   </td>
   <td>setUp9
   </td>
   <td>“zzz”
   </td>
   <td>List(122, 122, 122)
   </td>
  </tr>
  <tr>
   <td>stringToByteList()
   </td>
   <td>setUp10
   </td>
   <td>“zyyx”
   </td>
   <td>List(122, 121, 121, 120)
   </td>
  </tr>
  <tr>
   <td>stringToByteList()
   </td>
   <td>setUp11
   </td>
   <td>“áéü”
   </td>
   <td>List(-31, -23, -4)
   </td>
  </tr>
  <tr>
   <td>stringToByteList()
   </td>
   <td>setUp12
   </td>
   <td>“abc”
   </td>
   <td>List(97, 98, 99)
   </td>
  </tr>
  <tr>
   <td>stringToByteList()
   </td>
   <td>setUp13
   </td>
   <td>“cba”
   </td>
   <td>List(99, 98, 97)
   </td>
  </tr>
  <tr>
   <td>stringToByteList()
   </td>
   <td>setUp14
   </td>
   <td>“123”
   </td>
   <td>List(49, 50, 51)
   </td>
  </tr>
  <tr>
   <td>send() 
   </td>
   <td>setUp15
   </td>
   <td>“ú”
   </td>
   <td>List(114,-6)
   </td>
  </tr>
  <tr>
   <td>send() 
   </td>
   <td>setUp16
   </td>
   <td>“úÜ””
   </td>
   <td>List(31,-6,-36,34)
   </td>
  </tr>
  <tr>
   <td>send() 
   </td>
   <td>setUp17
   </td>
   <td>“bye”
   </td>
   <td>List(53, 98, 121, 101)
   </td>
  </tr>
  <tr>
   <td>send() 
   </td>
   <td>setUp18
   </td>
   <td>“my favorite movie is star wars”
   </td>
   <td>List(78, 109, 121, 32, 102, 97, 118, 111, 114, 105, 116,
<p>
      101, 32, 109, 111, 118, 105, 101, 32, 105, 115, 32, 115, 116, 97, 114, 32, 119, 97, 114, 115)
   </td>
  </tr>
  <tr>
   <td>send() 
   </td>
   <td>setUp19
   </td>
   <td>“I Want To Sleep”
   </td>
   <td>List(127, 73, 32, 87, 97, 110, 116, 32, 84, 111, 32, 83, 108, 101, 101, 112)
   </td>
  </tr>
  <tr>
   <td>send() 
   </td>
   <td>setUp20
   </td>
   <td>“Batman and Robin”
   </td>
   <td>List(95, 66, 97, 116, 109, 97, 110, 32, 97, 110, 100, 32, 82, 111, 98, 105, 110)
   </td>
  </tr>
  <tr>
   <td>send() 
   </td>
   <td>setUp21
   </td>
   <td>“i love cats”
   </td>
   <td>List(34, 105, 32, 108, 111, 118, 101, 32, 99, 97, 116, 115, 32)
   </td>
  </tr>
  <tr>
   <td>send() 
   </td>
   <td>setUp22
   </td>
   <td>“i want 6 ice creams”
   </td>
   <td>List[Byte] = List(4, 105, 32, 119, 97, 110, 116, 32,
<p>
      54, 32, 105, 99, 101, 32, 99, 114, 101, 97, 109, 115)
   </td>
  </tr>
  <tr>
   <td>send() 
   </td>
   <td>setUp23
   </td>
   <td>“hello world!”
   </td>
   <td>List(117, 104, 101, 108, 108, 111, 32, 119, 111, 114, 108, 100, 33)
   </td>
  </tr>
  <tr>
   <td>send() 
   </td>
   <td>setUp24
   </td>
   <td>“the password is 123456789”
   </td>
   <td>List(122, 116, 104, 101, 32, 112, 97, 115,
<p>
      115, 119, 111, 114, 100, 32, 105, 115, 32, 49, 50, 51, 52, 53, 54, 55, 56, 57)
   </td>
  </tr>
  <tr>
   <td>verify()
   </td>
   <td>setUp15
   </td>
   <td>“ú”
   </td>
   <td>true
   </td>
  </tr>
  <tr>
   <td>verify()
   </td>
   <td>setUp16
   </td>
   <td>“úÜ””
   </td>
   <td>true
   </td>
  </tr>
  <tr>
   <td>verify()
   </td>
   <td>setUp25
   </td>
   <td>“123456789”
   </td>
   <td>true
   </td>
  </tr>
  <tr>
   <td>verify()
   </td>
   <td>setUp26
   </td>
   <td>“see you later”
   </td>
   <td>true
   </td>
  </tr>
  <tr>
   <td>verify()
   </td>
   <td>setUp27
   </td>
   <td>“abcdefghij”
   </td>
   <td>true
   </td>
  </tr>
  <tr>
   <td>verify()
   </td>
   <td>setUp28
   </td>
   <td>“i love scala”
   </td>
   <td>true
   </td>
  </tr>
  <tr>
   <td>verify()
   </td>
   <td>setUp29
   </td>
   <td>“i don't like tomato”
   </td>
   <td>true
   </td>
  </tr>
  <tr>
   <td>verify()
   </td>
   <td>setUp30
   </td>
   <td>“All's fair in love and war.”
   </td>
   <td>true
   </td>
  </tr>
  <tr>
   <td>verify()
   </td>
   <td>setUp31
   </td>
   <td>“All's fair in love and war.”
   </td>
   <td>true
   </td>
  </tr>
  <tr>
   <td>verify()
   </td>
   <td>setUp32
   </td>
   <td>“When life gives you lemons, make lemonade.”
   </td>
   <td>true
   </td>
  </tr>
</table>