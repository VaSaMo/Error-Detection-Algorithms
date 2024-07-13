package model

import java.io.PrintWriter

trait ICSV:

  val PATH = "data/"
  val END = ".csv"

  def writeCSV[X, Y](filename: String, xData: List[X], yData: List[Y]): Unit = {
    val writer = new PrintWriter(PATH + filename + END)
    try {
      writer.println("BIT_SIZE,AVG_TIME")
      xData.zip(yData).foreach { case (x, y) =>
        writer.println(s"$x,$y")
      }
    } finally {
      writer.close()
    }
  }


