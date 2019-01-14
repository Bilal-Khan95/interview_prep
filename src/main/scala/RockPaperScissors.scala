object RockPaperScissors extends App {
  import scala.io.StdIn.readInt
  import scala.util.Random.nextInt

  start()

  def start(): Unit ={
    println("Welcome to Computerized Rock Paper Scissors\nPick an option\n1) Start game\n2) End Game")
    val userInput = readInt()
    userInput match{
      case 1 => computerChoice(userChoice())
      case _ => println("End Game")
    }
  }

  def restart(){
    println("Would you like to play again?\n1) Yes\n2) No\n")
    val userChoice = readInt()
    userChoice match{
      case 1 => start()
      case _ => println("End Game")
    }
  }

  def userChoice(): String ={
    println("\nChoose\n1)Rock\n2)Paper\n3)Scissors")
    val userInput = readInt()
    userInput match{
      case 1 => "Rock"
      case 2 => "Paper"
      case 3 => "Scissors"
      case _ => "End game"
    }
  }

  def computerChoice(userChoice:String){
    userChoice match{
      case "Rock" => playerChoiceRock()
      case "Paper" => playerChoicePaper()
      case "Scissors" => playerChoiceScissors()
    }
  }

  def playerChoiceRock(){
    println("Computer picked:\n")
    val computerChoice = nextInt(3)
    computerChoice match{
      case 0 => println("Rock.\nDraw\n")
      case 1 => println("Paper.\nYou lose\n")
      case 2 => println("Scissors.\nYou win\n")
    }
    restart()
  }

  def playerChoicePaper(){
    println("Computer picked:\n")
    val computerChoice = nextInt(3)
    computerChoice match{
      case 0 => println("Rock.\nYou win\n")
      case 1 => println("Paper.\nDraw\n")
      case 2 => println("Scissors.\nYou lose\n")
    }
    restart()
  }

  def playerChoiceScissors(){
    println("Computer picked:")
    val computerChoice = nextInt(3)
    computerChoice match{
      case 0 => println("Rock.\nYou lose\n")
      case 1 => println("Paper.\nYou win\n")
      case 2 => println("Scissors.\nDraw\n")
    }
    restart()
  }

}
