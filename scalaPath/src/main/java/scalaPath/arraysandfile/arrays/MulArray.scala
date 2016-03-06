package scalaPath.arraysandfile.arrays

/**
  * Created by liuyong on 2016/3/6.
  */
object MulArray {
  def main(args: Array[String]): Unit = {
    val matrix = Array.ofDim[Int](2, 3)//二维数组的声明
    matrix(0)(0) = 1
    println( matrix(0)(0))
  }
}
