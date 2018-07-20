object Program9 {
  def main(args: Array[String]): Unit = {
    val pri = minmax(Array(-1,2,3,4,2,6,7,10))
    for(x <- pri){
      println(x)
    }
  }
  def  minmax(values: Array[Int]): Array[Int] = {
    var min = values(0)
    var max = values(0)
    for(temp <- values){
      if(temp < min){
        min = temp
      }
      else if(temp > max){
        max = temp
      }
    }
    val result = Array(min,max)
    result
  }
}
