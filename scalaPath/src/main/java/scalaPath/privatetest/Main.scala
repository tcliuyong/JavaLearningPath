package scalaPath.privatetest

/**
  * Created by liuyong on 2016/3/5.
  */
object Main {
  def main(args: Array[String]) {
    val person = new Person
    person.increment()
    println(person.current)
    val student = new Student
    student.age = 10
    println(student.age)
  }
}
