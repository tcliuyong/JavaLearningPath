package scalaPath.functions

import java.io.File
import java.nio.file.Files

/**
 * Created by liuyong on 2016/3/4.
 */
object define {
  def doWhile(){
    var lines = "";
    do{
      lines = readLine()
      println("Read:" + lines)
    }while(lines != null)
  }
  def looper(x:Long, y:Long):Long = {
    var a = x
    var b = y
    while (a != 0){
      val tmp = a;
      a = b % a
      b = tmp
    }
    b
  }

  def listFile():Unit = {
    val files = (new File(".").listFiles())
    for(file <- files)
      println(file)
  }

  def main (args: Array[String]):Unit = {
    //doWhile()
    println(looper(1000,10000000))
    listFile()
  }
}
