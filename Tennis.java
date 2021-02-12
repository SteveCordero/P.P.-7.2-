class Tennis extends Sports
{
  private int outs;
  private int aces;
  private int sets;
  private boolean isDoubles;
  
  //Constructor
  public Tennis(String sport, String name, int score, boolean isTeam, boolean isWinner, int outs, int aces, int sets, boolean isDoubles)
  {
    super(sport,name,score,isTeam, isWinner);
    this.outs = outs;
    this.aces = aces;
    this.sets = sets;
    this.isDoubles = isDoubles;
  }//end constructor

  public String maxPlayers()
  {
    if(isDoubles)
    {
      return "There can be a total of 4 players on the court(2 persons per team)";
    }
    else
    {
      return "There can be total of 2 players on the court(1 person per team)";
    }
  }//end maxPlayers overridden method

  //toString
  public String toString()
  {
    String output = super.toString();
    output += "\nOuts = " + outs +
              "\nAces = " + aces +
              "\nTotal Sets = " + sets +
              "\nIs it a Doubles Match = " + isDoubles;
    return output;
  }//end toString
}//end Tennis 