package scalaPath.usingapply

/**
  * Created by tcliuyong on 2016/3/5.
  */
class ApplyTest {
  def apply()=println("I am into Spark")

  def havaATry: Unit ={
    println("Have a Try")
  }
  object ApplyTest{
    def apply() = {
      println("I am int Scala")
      new ApplyTest
    }
  }
object ApplyOperation{
  def main(args: Array[String]) {
    val array = Array(1,2,3,4)
    val a = ApplyTest()
    a.havaATry
  }
}

}
