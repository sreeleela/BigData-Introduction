object Program3 {
  def main(args: Array[String]): Unit = {
    print(product("zzzz"))
  }
  def  product(s: String): Long = {
    s.map (_.toLong).product
  }
}
