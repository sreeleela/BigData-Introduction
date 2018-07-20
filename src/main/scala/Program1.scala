object Program1 {
   def main(args: Array[String]): Unit = {
     print(sum_multiples_3_5(10))
   }
  def sum_multiples_3_5(n: Int): Int = {
    var sum: Int = 0
    for (i <- 1 to n-1) {
      if (i % 3 == 0 || i % 5 == 0) {
        if(i % 3 == 0 && i % 5 == 0){
        }
        else{
          sum = sum + i;
        }
      }
    }
    sum
  }
 }

