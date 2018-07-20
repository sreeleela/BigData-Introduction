object Program2 {
  def main(args: Array[String]): Unit = {
    print(patternCount("abcde","abc"))
  }
  def  patternCount(text: String, pattern: String): Int = {
    var count:Int = 0;
    val patternLength:Int = pattern.length();
    val textLength:Int = text.length();
    var tempString:String ="";
    for(i <- 0 to textLength - patternLength) {
      tempString = text.substring(i,i+patternLength)
      if(tempString.contentEquals(pattern)){
        count = count + 1
      }
    }
    count
  }
}
