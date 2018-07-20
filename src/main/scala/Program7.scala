object Program7 {
  def main(args: Array[String]): Unit = {
    val pri = randomInts(10,100)
    for(x <- pri){
      println(x)
    }
  }
  def  randomInts(n:Int, range:Int): Array[Int] = {
    var result = Array(0)
    val randomNum = scala.util.Random
    for(i <- 0 to n-1){
      if(i==0) {
        result(i) = randomNum.nextInt(range)
      }
      else{
        result = result ++ Array(randomNum.nextInt(range))
      }
    }
    result
  }
}
