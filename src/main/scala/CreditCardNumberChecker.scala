import scala.Predef._
import scala.io.StdIn.readLine
object CreditCardNumberChecker extends App {

  println("Enter a number sequence")
  val numInput = readLine()
  var numForUse = Array[Int]()
  var totalNumber = 0
  stringToArray(numInput)
  checkNumAdder(numForUse)

  def stringToArray(a:String): Unit ={
    for(i <- 0 until a.length){
      numForUse = numForUse :+ a.substring(i,i+1).toInt
    }
  }

  def luhnAlgorithm(numAsArray:Array[Int]):Boolean={
    val numArrReverse = numAsArray.reverse
    val idNum = numAsArray(numAsArray.length-1)
    for(i <- 1 until numAsArray.length){
      var numIndex = numArrReverse(i)
      if((i%2) != 0){
        totalNumber+= numTimes2(numIndex)
      }else{
        totalNumber += numIndex
      }
    }
    totalNumber += idNum
    totalNumber%10 == 0
  }

  def strToInt(num:String):Int={
    num.toInt
  }

  def numTimes2(numToBeDoubled:Int):Int={
    val result = numToBeDoubled*2
    if(result > 9){
      result - 9
    }else{
      result
    }
  }

  def checkNumAdder(numString:Array[Int]):Unit ={
  val replacementNums = Array.range(0,10)
  if(luhnAlgorithm(numString)){
      println("Number is VALID " + numInput)
    }else{
      println("Number is INVALID")
      for(i <- replacementNums.indices){
        numString(numString.length-1) = i
        if(luhnAlgorithm(numString)){
          println("New VALID number: " + numString.mkString(""))
        }
      }
    }
  }
}