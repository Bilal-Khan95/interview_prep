import scala.Predef._
import scala.io.StdIn.{readLine, readLong}
object CreditCardNumberChecker extends App {

  println("Enter a number sequence")
  val numInput = readLine
  var totalNumber = 0
  println(numInput.toArray.foreach(println))
  checkNumAdder(numInput)

  def luhnAlgorithm(numAsString:String):Boolean ={
    val numStrReverse = numAsString.reverse
    val idNum = strToInt(numStrReverse.substring(0,1))
    for(i <- 1 until numAsString.length){
      var numIndex = strToInt(numStrReverse.substring(i,i+1))
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

  def checkNumAdder(numString:String):Unit ={
    val a = Array.range(0,9)
    val b = a.toString
    if(luhnAlgorithm(numString)){
      println("Number is VALID " + numString)
    }else{
      println(numString.toInt)
      print("Number is INVALID")
      for(i <- b){
        if(luhnAlgorithm(numString+i)){
          println(numString+i)
        }
      }
    }
  }

} // use arrays instead of string, easier to work with