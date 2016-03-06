package scalaPath.matches

/**
  * Created by liuyong on 2016/3/6.
  */
//更好的switch
object Cases {
  def main(args: Array[String]) {
    var ch = '+'
    var sign = 0
    ch match{
      case '+' => sign = 1
      case '-' => sign = -1
      case _ => sign = 100
    }
    println(sign)
  }
}
