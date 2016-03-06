package scalaPath.construct

/**
  * Created by liuyong on 2016/3/5.
  */
object Main {
  def main(args: Array[String]) {
    val teacher = new Teacher("test")
    teacher.sayHello()
    val p = new ParameterTeacher("hello",34,"male")
  println(p.gender)
  }
}
