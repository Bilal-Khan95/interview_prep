object BeerSong1 extends App{
  val NumbersList = 99 to 0 by -1
  def cokeSong(bottle_no:Int){
    var bottle_no_1_less = bottle_no - 1
    if(bottle_no == 1){
      println(s"\n$bottle_no bottle of coke on the wall, $bottle_no bottle of coke. \nTake one down, pass it around, $bottle_no_1_less bottles of coke on the wall.")
    }else{
      println(s"\n$bottle_no bottles of coke on the wall, $bottle_no bottles of coke. \nTake one down, pass it around, $bottle_no_1_less bottles of coke on the wall.")
    }
  }
  NumbersList.foreach{i => if(i >0) cokeSong(i) else println("\nNo more bottles of coke.")}
}
