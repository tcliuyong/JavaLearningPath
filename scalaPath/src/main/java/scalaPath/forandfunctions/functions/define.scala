package scalaPath.forandfunctions.functions

import java.io.File

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

  def fac(n : Int):Int = if(n <= 0) 1 else n * fac(n - 1)

  def combine(content:String,left:String = "[" ,right:String = "]" ) =
    left + content + right
  def main (args: Array[String]):Unit = {
    //doWhile()
    var x = 1
    println(looper(1000,10000000))
    listFile()
    val add = (x : Int) => x + 200
    println(add(100))
    println(combine(" I Love you "))
  }
}
