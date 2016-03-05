package scalaPath.forandfunctions.loop

/**
 * Created by liuyong on 2016/3/5.
 */
object For {
  def demo1():Unit={
    for(i <- 1 to 2; j <- 1 to 4){
      println(i * j)
    }
  }
  def demo2():Unit={
    for(i <- 1 to 2; j <- 1 to 4 if i != j){
      println(i * j)
    }
  }
  def main(args: Array[String]) {
//    demo1()
    demo2()
  }
}
