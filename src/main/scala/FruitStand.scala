import scala.collection.mutable.ListBuffer
import scala.io.StdIn.readInt

object FruitStand extends App {

  val noOfFruit = ListBuffer[String]()
  var noOfApples = 0
  var noOfOranges = 0

  start()

  def appleCounter(apple:Int): Unit ={
    for(i<- 0 to apple){
      noOfFruit += "apple"
      noOfApples += 1
    }
  }

  def orangeCounter(orange:Int): Unit ={
    for(i<- 0 to orange){
      noOfFruit += "orange"
      noOfOranges += 1
    }
  }

  def start(): Unit ={
    println("Can I offer you an nice apple or orange in this trying time?\n1) Yes\n2) No")
    val userInput = readInt()
    userInput match{
      case 1 => shoppingList()
      case _ => println("Invalid selection")
    }
  }

  def shoppingList(): Unit ={
    println("Choose:\n1)Apples\n2)Oranges\n3)Total to pay")
    val userInput = readInt()
    userInput match{
      case 1 => appleInput()
      case 2 => orangeInput()
      case _ => payment()
    }
  }

  def appleInput(): Unit = {
    println("\nEnter how many you would like to purchase")
    val userInput = readInt()
    appleCounter(userInput)
    println("\nWould you like to add oranges?\n1)Yes \n2)No")
    val userInput2 = readInt()
    userInput2 match{
      case 1 => orangeInput()
      case _ => payment()
    }
  }

  def orangeInput(): Unit ={
    println("\nEnter how many you would like to purchase")
    val userInput = readInt()
    orangeCounter(userInput)
    println("\nWould you like to add apples?\n1)Yes \n2)No")
    val userInput2 = readInt()
    userInput2 match{
      case 1 => appleInput()
      case _ => payment()
    }
  }

  def payment(): Unit ={
    val totalPriceApple:Double = noOfApples * 0.60
    val totalPriceOrange:Double = noOfApples * 0.25
    val sum:Double = totalPriceApple + totalPriceOrange
    println(s"\ntotal apples: $noOfApples\ntotal oranges: $noOfOranges\nto pay £$sum")
  }
}