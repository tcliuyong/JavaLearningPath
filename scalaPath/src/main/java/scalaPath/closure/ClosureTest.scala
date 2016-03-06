package scalaPath.closure

/**
  * Created by liuyong on 2016/3/6.
  */
object ClosureTest {
  def mulBy(factor : Double) = (x : Double) => factor * x //闭包

  def main(args: Array[String]) {
    val t = mulBy(3)
    println(t)
    val h = mulBy(0.5)
    println(t(4) + " " + h(14))
  }
}
