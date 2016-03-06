package scalaPath.closure

/**
  * Created by liuyong on 2016/3/6.
  */
object Currying {
def mul(x: Int, y : Int) = x * y
def mulOneAtATime(x : Int) = (y: Int) => x * y

  def main(args: Array[String]) {
    println(mulOneAtATime(3)(4))
  }
}
