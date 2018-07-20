import java.io._
import scala.io.Source
import java.math._


object Program8 {
  def main(args: Array[String]): Unit = {
    averageAndMedian()
  }
  def averageAndMedian() = {
    println("Creating files ....")
    creatingFiles(1, 1000, "File1.txt")
    creatingFiles(2, 100000, "File2.txt")
    creatingFiles(3, 10000000, "File3.txt")
    calAverage("File1.txt",10000)
    calAverage("File2.txt",100000)
    calAverage("File3.txt",10000000)
    calMedian("File1.txt",1000)
    calMedian("File2.txt",100000)
    calMedian("File3.txt",10000000)
  }
  def creatingFiles(fileNumber: Int, length: Int, filename: String) ={
    val writer = new PrintWriter(new File(f"$filename" ))
    println(f"Created File $fileNumber.....")
    println(f"Adding Data to File $fileNumber...")
    val randomNum = scala.util.Random
    for( counter <- 1 to length) {
      writer.write(randomNum.nextInt(Int.MaxValue / 2)+"\n")
    }
    println(f"Data added successfully to File $fileNumber...")
    writer.close()
  }
  def calAverage(filename: String, range: Long) = {
    val source = Source.fromFile(new File(f"$filename")).getLines
    var sum = BigInteger.valueOf(0);
    var initTime = System.nanoTime()
    while (source.hasNext) {
      sum = sum.add(new BigInteger(source.next()));
    }
    var average = new BigDecimal(0.0);
    var tempSum =  new BigDecimal(sum);
    average = tempSum.divide(new BigDecimal(range))
    var finalTime = System.nanoTime()
    println(f"Average of $filename is $average")
    var timeTaken = finalTime - initTime
    println(f"Time taken $timeTaken nano sec.")
    println()
  }
  def calMedian(filename: String, range: Long) = {
    val source = Source.fromFile(new File(f"$filename")).getLines
    var arrayNum = Array(BigInteger.valueOf(0))
    var initTime = System.nanoTime()
      while (source.hasNext) {
        arrayNum = arrayNum ++ Array(new BigInteger(source.next()))
      }
      var listNum = arrayNum.toList
      var sortedList = listNum.sorted
      var num1 = (range.toInt / 2)
      var num2 = num1 + 1
      var value1 = sortedList(num1)
      var value2 = sortedList(num2)
      var sum = new BigDecimal(value2.add(value1))
      var result = sum.divide(new BigDecimal(2))
      println(f"Median of $filename is $result")
      var finalTime = System.nanoTime()
      var timeTaken = finalTime - initTime
      println(f"Time taken $timeTaken nano sec.")
      println()
  }
}
