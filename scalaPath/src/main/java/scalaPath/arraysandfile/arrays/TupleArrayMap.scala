package scalaPath.arraysandfile.arrays

/**
 * Created by liuyong on 2016/3/4.
 */
object TupleArrayMap {
  def main(args: Array[String]) {
    //tuple
    val pair = (100,"scala","java")
    println(pair._1)
    println(pair._2)
    println(pair._3)
  }
  //array
  val array = Array(1,2,3,4,5)
  for(i <- 0 until array.length){
    println(array(i))

  }
  //Map
  val map  = Map("scala" -> 27,"java"->5)
    for ((k,v)<- map){
    println(k + v)
  }
  for((k,_) <- map){
    println(k)
  }
}
