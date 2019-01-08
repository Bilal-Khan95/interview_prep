object BeerSong2 extends App{
  def pepsiSong(pepsi_no:Int){
    if(pepsi_no > 1) {
      println(s"\n$pepsi_no bottles of coke on the wall, $pepsi_no bottles of coke. \nTake one down, pass it around, " + (pepsi_no - 1) + " bottles of coke on the wall.")
      pepsiSong(pepsi_no-1)
    }else if(pepsi_no == 1){
      println(s"\n$pepsi_no bottle of coke on the wall, $pepsi_no bottle of coke. \nTake one down, pass it around, " + (pepsi_no - 1) + " bottles of coke on the wall.")
      pepsiSong(pepsi_no-1)
    }else if(pepsi_no == 0){
      println("\nNo more bottles of coke.")
      pepsiSong(pepsi_no-1)
    }
  }
  pepsiSong(99)
}
