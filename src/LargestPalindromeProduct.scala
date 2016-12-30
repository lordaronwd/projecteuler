/**
  * @author lazar.agatonovic
  */
object LargestPalindromeProduct {

  def main(args: Array[String]): Unit = {
    val start = System.currentTimeMillis()
    println(getLargestPalindrome)
    val end = System.currentTimeMillis()

    println(end - start)
  }

  def getLargestPalindrome: Long = {
    var max = 100001
    for (i <- 999 to 100 by -1) {
      if (i * 999 < max) return max
      for (j <- 999 to 100 by -1) {
        val product = i * j
        if (product > max && isPalindrome(product)) {
          println(s"$i $j")
          max = product
        }
      }
    }
    max
  }

  def isPalindrome(n: Long): Boolean = {
    val str = n.toString
    for (i <- 0 until str.length/2) {
      val a = str.charAt(i)
      val b = str.charAt(str.length - i - 1)
      if (a != b) {
        return false
      }
    }
    true
  }
}
