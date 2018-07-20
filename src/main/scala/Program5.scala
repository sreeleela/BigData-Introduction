object Program5 {
  def main(args: Array[String]): Unit = {
    longArray()
  }
  def  longArray() = {
    var array = Array(0.00001f)
    var sum:Float = 0.00001f
    for(i <- 1 to  1000000-1 ){
        array = array ++ Array(0.00001f)
        sum = sum + array(i)
    }
    print(sum)
  }
}
