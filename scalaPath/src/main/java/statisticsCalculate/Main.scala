package statisticsCalculate
import statisticsCalculate.SampleAttribute
import scala.collection.mutable.ArrayBuffer


/**
  * Created by liuyong on 2016/5/11.
  */
object Main {
  def main(args: Array[String]) {
    var arr = ArrayBuffer[Double]()
    arr += 6.0
    arr += 2.0
    arr += 3.0
    arr += 5.0
//    arr += 3.0
    arr += 7.0
//    arr += 7.0
//    var arr1 = ArrayBuffer[Double]()
//    arr1 += 4.0
//    arr1 += 3.0
//    arr1 += 2.0
    val sampleAttribute = new SampleAttribute(arr)
    var mean = sampleAttribute.calMean()
    val variance = sampleAttribute.calVariance()
    val cv = sampleAttribute.calCV()
    val moment2 = sampleAttribute.Moment2()
    val moment3 = sampleAttribute.Moment3()
    val moment4 = sampleAttribute.Moment4()
    val centerMonment2 = sampleAttribute.calCenterMoment2()
    val centerMonment3 = sampleAttribute.calCenterMoment3()
    val centerMonment4 = sampleAttribute.calCenterMoment4()
    val kurtosis = sampleAttribute.calKurtosis()
    var modes = sampleAttribute.calMode()

    //val loadData = new LoadData("D:\\person.txt", System.lineSeparator())
    //var mulVariableFeature = new MulVariableFeature(arr, arr1).calCorrelationCoefficient()
    var median = sampleAttribute.calMedian();
    println("meaia:" + median)
    println(mean)
    println(variance)
    println(cv)
    println(moment2)
    println(moment3)
    println(moment4)
    println(centerMonment2)
    println(centerMonment3)
    println(centerMonment4)
    println(kurtosis)
    //println(mulVariableFeature)
    //println(mulVariableFeature)
    println(modes)
    println(sampleAttribute.mode)
  }
}
