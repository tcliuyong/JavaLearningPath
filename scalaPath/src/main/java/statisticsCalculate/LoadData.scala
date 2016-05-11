package statisticsCalculate

import scala.collection.mutable.ArrayBuffer
import scala.io.Source

/**
  * Created by liuyong on 2016/5/11.
  */
class LoadData {
  var path = ""
  var separator = ""
  def this(path : String,separator:String){
    this
    this.path = path
    this.separator = separator
  }
  def loadFileToDoubleArray():ArrayBuffer[Double]={
    var arrayBuffer = new ArrayBuffer[Double]()
    for (line <- Source.fromFile(path).getLines()){
      arrayBuffer += line.toDouble
    }
    arrayBuffer
  }
}
