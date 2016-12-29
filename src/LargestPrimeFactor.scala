/**
  * @author lazar.agatonovic
  */
object LargestPrimeFactor {

  def main(args: Array[String]): Unit = {
    println(lpf(600851475143L))
  }

  def lpf(n: Long): Long = {
    var max, temp = n

    while (temp % 2 == 0) {
      temp /= 2
      max = 2
    }

    for (i <- 3 to Math.sqrt(n).toInt by 2) {
      while (temp % i == 0) {
        temp /= i
        max = i
      }
    }

    if (temp > 2) temp else max
  }
}
