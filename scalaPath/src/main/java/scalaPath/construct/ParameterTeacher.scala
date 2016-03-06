package scalaPath.construct

/**
  * Created by liuyong on 2016/3/5.
  */
class ParameterTeacher(val name: String,val age : Int) {

  var gender : String = _
  def this(name:String, age : Int, gender : String){ //构造方法
    //默认构造器是主构造器 其他都是重载主构造器
    this (name, age)//重载主构造器
    this.gender = gender
  }
  def sayHello(): Unit ={
    println(this.name + ":" + this.age + ":" + this.gender)
  }
}
