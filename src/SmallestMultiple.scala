/**
  * @author lazar.agatonovic
  */
object SmallestMultiple {

  def main(args: Array[String]): Unit = {
    println(getSmallestMultiple)
  }

  def getSmallestMultiple: Long = {
    var cnt = 0L
    while (true) {
      cnt += 20

      var hit = true
      for (i <- 10 to 19) {
        if (cnt % i != 0)
          hit &&= false
      }
      if (hit) return cnt
    }
    cnt
  }
}
