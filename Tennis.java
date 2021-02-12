class Tennis extends Sports
{
  private int outs;
  private int aces;
  private int sets;
  
  //Constructor
  public Tennis(String sport, String name, int score, boolean isTeam, boolean isWinner, int outs, int aces, int sets)
  {
    super(sport,name,score,isTeam, isWinner);
    this.outs = outs;
    this.aces = aces;
    this.sets = sets;
  }//end constructor

  //toString
  public String toString()
  {
    String output = super.toString();
    output += "\nOuts = " + outs +
              "\nAces = " + aces +
              "\nTotal Sets = " + sets;
    return output;
  }//end toString
}//end Tennis 