package scalaPath.innerclass

/**
  * Created by tcliuyong on 2016/3/5.
  */
class Outer(val name: String) { outer =>
  class Inner(val name: String){
    def foo(b:Inner) = println("Outer:" + outer.name +
    "Inner:" + b.name)
  }
}
object OOPInScala{
  def main(args: Array[String]) {
    val outer1 = new Outer("Spark")
    val outer2 = new Outer("Hadoop")
    val inner1 = new outer1.Inner("Scala")
    val inner2 = new outer2.Inner("Scala")
    inner1.foo(inner1)
    inner2.foo(inner2)

  }
}
