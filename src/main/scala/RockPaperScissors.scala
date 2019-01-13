object RockPaperScissors extends App {
  import scala.io.StdIn.readInt
  import scala.util.Random.nextInt

  start()

  def start(): Unit ={
    println("Welcome to Computerized Rock Paper Scissors\nPick an option\n1) Start game\n2) End Game")
    val userInput = readInt()
    userInput match{
      case 1 =>
      case _ => println("End Game")
    }
  }

  def restart(): Unit ={
    println("Would you like to play again?\n1) Yes\n2) No")
    val userChoice = readInt()
    userChoice match{
      case 1 => computerChoice(userChoice())
      case _ => println("End Game")
    }
  }

  def userChoice(): String ={
    println("Choose\n1)Rock\n2)Paper\n3)Scissors")
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
      case 1 => println("Paper.\nComputer wins\n")
      case 2 => println("Scissors.\nPlayer wins\n")
    }
    restart()
  }

  def playerChoicePaper(){
    println("Computer picked:\n")
    val computerChoice = nextInt(3)
    computerChoice match{
      case 0 => println("Rock.\nPlayer wins\n")
      case 1 => println("Paper.\nDraw\n")
      case 2 => println("Scissors.\nComputer wins\n")
    }
    restart()
  }

  def playerChoiceScissors(){
    println("Computer picked:")
    val computerChoice = nextInt(3)
    computerChoice match{
      case 0 => println("Rock.\nComputer wins\n")
      case 1 => println("Paper.\nPlayer wins\n")
      case 2 => println("Scissors.\nDraw\n")
    }
    restart()
  }

}
