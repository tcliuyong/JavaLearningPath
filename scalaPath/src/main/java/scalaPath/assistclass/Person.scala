package scalaPath.assistclass

/**
  * Created by liuyong on 2016/3/6.
  */
class Person {
  private var name = ""
  private var age = 0
  def this(name : String){ // 一个辅助构造器
    this() //调用主构造器
    this.name = name
  }
  def this(name: String, age: Int){
    this(name) //調用前一个辅助构造器
    this.age = age
  }
}
object test{
  def main(args: Array[String]) {
    val p1 = new Person //主构造器
    val p2 = new Person("Fred") //辅助构造器
    val p3 = new Person("Fred", 42) //辅助构造器
  }
}

