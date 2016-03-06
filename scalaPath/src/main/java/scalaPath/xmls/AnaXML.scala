package scalaPath.xmls

import scala.xml.NodeBuffer

/**
  * Created by liuyong on 2016/3/6.
  */
object AnaXML {
  def main(args: Array[String]): Unit = {
    val doc = <html><head><title>tcliuyong</title></head></html>
    val items =doc.attributes
    for(attr <- items){
      println(attr.value.text)
    }
  }
}
