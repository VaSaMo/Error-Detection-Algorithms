
**BIT SEQUENCE ADT**

<table>
  <tr>
   <td>BIT SEQUENCE
   </td>
  </tr>
  <tr>
   <td>Bit Sequence = Byte
   </td>
  </tr>
  <tr>
   <td>Operations:
<ul>

<li>StringToByteList → String →  List (Byte)


<li>byteToBinaryString  →   Byte  →   String


<li>isLastBit0  →  Byte    →   Boolean


<li>replaceLastBit  →   (Byte, Byte, Int)   →   Byte


<li>getBit   →    (Byte, Int)   →  Int


<li>divide   →    (Byte, Byte, Int)   →   Byte


<li>sumListOfByte   →   List (Byte)    →   Byte
</li>
</li>
</li>
</li>
</li>
</li>
</li>
</ul>
   </td>
  </tr>
</table>


Operations:


```
StringToByteList (s)
"Converts a string to a list of bytes"

{Pre: s is a valid  string}

{Post: Returns a list of bytes where each byte represents the ASCII value of the corresponding character in the string}

```



```
byteToBinaryString (b)
"Converts a byte to its binary string representation"

{Pre: b is a valid byte}

{Post: Returns a string representing the binary form of the byte}

```



```
isLastBit0(b)
"Checks if the last bit (most significant bit) of a byte is 0"

{Pre:b is a valid byte}

{Post: Returns true if the most significant bit of the byte is 0, otherwise false}

```



```
ReplaceLastBit(x, y, pos)
"Replaces the last bit of a byte with the bit from another byte at a given position. "

{Pre: x and y are valid bytes, pos is a valid bit position (0-7)}

{Post: Returns a new byte with the last bit replaced by the bit at the given position from the other byte}

```



```
getBit(b, position)
"Retrieves the bit at a specified position from a byte."

{Pre: b is a valid byte, position is a valid bit position (0-7)}

{Post: Returns the bit (0 or 1) at the specified position in the byte}

```



```
divide(head, r, numOfPos)
"Performs a division operation on bytes according to the given parameters"

{Pre: head and r are valid bytes, numOfPos is a valid bit position (0-7)r}

{Post: Returns the result of the division operation}

```



```
SumListOfByte(l)
"Sums a list of bytes"

{Pre: l is a list of valid bytes}

{Post: Returns the sum of the bytes in the list as a byte}

```

