/**
  * @author lazar.agatonovic
  */
object EvenFibonacci {

  def main(args: Array[String]): Unit = {
    println(bySwapping())
    println(usingList())
  }
  def bySwapping(): Long = {
    var x = 1
    var y = 2
    var sum = 2

    while (x <= 4000000 && y <= 4000000) {
      x += y
      y += x

      if (x % 2 == 0) sum += x
      if (y % 2 == 0) sum += y
    }
    sum
  }

  def usingList(): Long = {
    var fibArray = List(1, 2)
    var current = 2
    var sum = 2
    var i = 2

    while (current <= 4000000) {
      current = fibArray(i-1) + fibArray(i - 2)
      fibArray = fibArray :+ current
      i += 1
      if (current % 2 == 0) {
        sum += current
      }
    }
    sum
  }
}
