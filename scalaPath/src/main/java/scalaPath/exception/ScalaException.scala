package scalaPath.exception

/**
 * Created by liuyong on 2016/3/4.
 */
object ScalaException {
  def main (args: Array[String]){
    val n = 99
    val file = "scala.txt"
    try{
      val half = if(n % 2 == 0) n / 2 else throw
        new RuntimeException("N must be event")
    }catch {
      case e : Exception => println("The exception:"+ e.getMessage)//如果匹配不进行后面的检查
    }finally {

    }
  }
}
