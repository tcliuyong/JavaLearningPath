package scalaPath.enumeration

/**
  * Created by liuyong on 2016/3/6.
  */
object  EnumTest extends Enumeration{
  //val Red, Yellow, Creen = Value
  val Red = Value(1, "Stop")
  val Yellow = Value("Wait")    //可以单独传名称
  val Green = Value(4) //可以单独传ID
}