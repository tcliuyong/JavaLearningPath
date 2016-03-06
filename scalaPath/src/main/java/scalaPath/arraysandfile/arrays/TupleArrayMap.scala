package scalaPath.arraysandfile.arrays

import scala.collection.mutable.ArrayBuffer

/**
 * Created by liuyong on 2016/3/4.
 */
object TupleArrayMap {
  def main(args: Array[String]) {
    //tuple
    val pair = (100,"scala","java")
    println(pair._1)
    val array = Array(1,2,3,4,5)
    val nums = new Array[Int](10)
    val strs = new Array[String](10)
    var buffer = ArrayBuffer[Int]()//变长数组
    buffer += 2
    buffer += (1,2,3)
    buffer ++= Array(123,4456)
    for(ele <- buffer){
      println(ele)
    }
    for(i <- 0 until array.length){
      println(array(i))
    }
    for(ele <- buffer.filter(_ % 2 == 0).map(_ * 2)){
      println(ele)
    }

    buffer.insert(1,23)
    buffer.remove(0)
    //buffer.toArray

    //Map
    var map  = Map("scala" -> 27,"java"->5)
    for ((k,v)<- map){
      println(k + v)
    }
    map += ("T"-> 10)
    map -= "java"
    //map.getOrElse("abc" , 100)
    for((k,v) <- map){
      println(k  + v)
    }
    // zip
    val symbol = Array(1,2,3)
    val counts = Array(2,56,34)
    val tmp = symbol.zip(counts)
    for((k,v) <- tmp){
      Console.println(k * v)
    }
  }
  //array


}
