package scalaPath.traits

/**
  * Created by liuyong on 2016/3/6.
  */
trait Logger {
def log(msg : String)
}
class ConsoleLogger extends Logger{
  override def log(msg: String): Unit = {
    println(msg)
  }
}