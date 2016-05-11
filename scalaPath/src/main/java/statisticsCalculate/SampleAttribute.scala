package statisticsCalculate
import scala.collection.mutable.ArrayBuffer
/**
  * Created by liuyong on 2016/5/11.
  */
class SampleAttribute {
  var moment1Sum = 0.0 //二阶原点矩和
  var moment2Sum = 0.0 //二阶原点矩和
  var moment3Sum = 0.0 //三阶原点矩和
  var moment4Sum = 0.0//四阶原点矩和
  var n = 0
  var arr = new ArrayBuffer[Double]()
  var mean = 0.0 //均值
  var mean2 = 0.0 //均值的二次方
  //用简单的方法计算n阶矩
  def this(arr : ArrayBuffer[Double]){
    this
    this.n = arr.length
    this.arr = arr
    for(i <- 0 until(n)){
      this.moment1Sum += arr(i)
      this.moment2Sum += scala.math.pow(arr(i), 2.0)
      this.moment3Sum += scala.math.pow(arr(i), 3.0)
      this.moment4Sum += scala.math.pow(arr(i), 4.0)
    }
    mean = this.moment1Sum / n
    mean2 = scala.math.pow(mean, 2.0)
  }
  //计算数据均值
  def calMean():Double={
    moment1Sum / n
  }

  //计算方差
  def calVariance():Double = {
    val mean = calMean()
    var variance = 0.0
    val n = arr.length
    if(mean == Nil) return -0.999
    for(i <- 0 until(n)){
      variance += (arr(i) - mean) * (arr(i) - mean)
    }
    variance/n
  }

  //计算变异系数
  def calCV():Double = {
    var cv = 0.0
    var variance= calVariance()
    var mean= calMean()
    cv = scala.math.sqrt(variance) / mean
    cv
  }

  //计算2阶原点矩
  def Moment2():Double = {
    moment2Sum / n
  }
  //计算3阶原点矩
  def Moment3():Double = {
    moment3Sum / n
  }
  //计算4阶原点矩
  def Moment4():Double = {
    moment4Sum / n
  }
  //2阶中心距 也就是方差
  def calCenterMoment2():Double = {
    var centerMoment2 = (moment2Sum - moment1Sum * mean) / n
    centerMoment2
  }

  //3阶中心距
  def calCenterMoment3():Double = {
    //(moment3Sum - 3 * mean * moment2Sum + 2 * moment1Sum * mean2) / n
    var centerMoment3 = moment3Sum - 3 * mean * moment2Sum + 2 * moment1Sum * mean2
    centerMoment3
  }
  //4阶中心距
  def calCenterMoment4():Double = {
    var centerMoment3 = calCenterMoment3()
    var centerMoment2 = calCenterMoment2()
    var centerMoment4 = centerMoment3 / scala.math.pow(centerMoment2, 1.5)
      centerMoment4
  }

  //计算三本峰度
  def calKurtosis():Double={
    var centerMoment3 = calCenterMoment3()
    var centerMoment2 = calCenterMoment2()
    var centerMoment4 = centerMoment3 / scala.math.pow(centerMoment2, 1.5)
    var kurtosis = centerMoment4/(centerMoment2 * centerMoment2)
    kurtosis - 3
  }
}
