package model
import scala.util.Random

trait IGenerateString:

  def stringGenerator(length: Int): String =

    val base = "ABCDEFGHIJKLMNOPQRTSUVWXYZ abcdefghijklmnopqrstuvwxyz 0123456789"
    val baseLength = base.length
    val random = new Random()

    (1 to length).map(_ => base(random.nextInt(baseLength))).mkString



