package scalaPath.construct

/**
  * Created by liuyong on 2016/3/5.
  */
class Teacher {
  var name :String = _ //赋值
  private var age = 27
  private [this] val gender = "male" //仅仅本类 当前的实例 不能别的方法的变量
  def this(name:String){ //构造方法
    //默认构造器是主构造器 其他都是重载主构造器
    this //重载主构造器
    this.name = name
  }
  def sayHello(): Unit ={
    println(this.name + ":" + this.age + ":" + this.gender)
  }
}
