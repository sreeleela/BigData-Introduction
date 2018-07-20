object Program6 {
  def main(args: Array[String]): Unit = {
    addition()
  }
  def addition() = {
    val sumOfFloat:Float =  0.0001f + 8000.0f
    val sumOfDouble:Double = 0.000000001 + 90000000
    println(sumOfFloat)
    println(sumOfDouble)
  }
}
