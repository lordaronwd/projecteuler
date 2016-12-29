/**
  * @author lazar.agatonovic
  */
object Multiples3And5 {

  def main(args: Array[String]): Unit = {
    println(valueMatching(1000))
    println(filtering(1000))
  }

  def filtering(upperBound: Int): Int = {
    (3 until upperBound).filter(i => i % 3 == 0 || i % 5 == 0) sum
  }

  def valueMatching(upperBound: Int): Int = {
    var sum = 0
    for (i <- 3 until upperBound) {
      i match {
        case x if x % 3 == 0 => sum += x
        case x if x % 5 == 0 => sum += x
        case _ =>
      }
    }
    sum
  }
}
