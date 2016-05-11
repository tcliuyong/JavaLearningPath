package statisticsCalculate

import scala.collection.mutable.ArrayBuffer

/**
  * Created by liuyong on 2016/5/11.
  */
class MulVariableFeature {
  var covariance = 0.0
  var XSum = 0.0
  var YSum = 0.0
  var XYSum = 0.0
  var X = new ArrayBuffer[Double]()
  var Y = new ArrayBuffer[Double]()
  var n = 0
  def this(X : ArrayBuffer[Double], Y:ArrayBuffer[Double]){
    this
    this.X = X
    this.Y = Y
    this.n = X.length
    for(i <- 0 until(n)){
      XSum += X(i)
      YSum += Y(i)
      XYSum += X(i)*Y(i)
    }
  }
  //计算协方差
  def calCovariance(): Double = {
    var reciprocalN = 1.0 / n
    var covariance = XYSum - reciprocalN * XSum * YSum
    covariance / (n- 1)
  }
  //计算相关系数COR
  def calCorrelationCoefficient() : Double = {
    var correlationCoefficient = 0.0
    val sampleAttributeX = new SampleAttribute(X)
    val sampleAttributeY = new SampleAttribute(Y)
    var varianceX = sampleAttributeX.calVariance()
    var varianceY = sampleAttributeY.calVariance()
    var varianceXY = calCovariance()
    varianceXY / (scala.math.sqrt(varianceX) * scala.math.sqrt(varianceY))

  }

}
