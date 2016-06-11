package scalaPath.model

/**
  * Created by liuyong on 2016/6/11.
  */
object Main {
  def main(args: Array[String]) {
    //注意这里的性别属性是不能访问的
    val p = new Person
    val p1 = new Person1("ttt",23)
    p.name = "test"
    p.age = 12
    println(p.name + " " + p.age)
  }
}
