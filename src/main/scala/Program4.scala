object Program4 {
  def main(args: Array[String]): Unit = {
    var array:Array[Int] = noDuplicates(Array(1,2,3,1,2,10,1,5,5,2,2,3,2))
    for(i <- array)
      println(i)
  }
  def  noDuplicates(ints : Array[Int]): Array[Int] = {
    ints.toSet.toArray
  }
}
