package scalaPath.arraysandfile.dofiles

import scala.collection.mutable.ArrayBuffer
import scala.io.Source

/**
 * Created by liuyong on 2016/3/4.
 */
object ReadFile {
  def readFile(filename:String)= {
    var array = new ArrayBuffer[String]//变长数组
    val file = Source.fromFile(filename)
//    val file = Source.fromURI("www.baidu.com")
    for(line <- file.getLines()){
      array += line
    }
    array
  }

  def main(args: Array[String]) {
    for(elem <- readFile("E:\\all.txt")){
      println(elem)
    }
  }
}
