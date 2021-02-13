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

  //Setters and Getters
  public int getOuts()
  {
    return outs;
  }//end getter for outs

  public void setOuts(int outs)
  {
    this.outs = outs;
  }//end setter for outs

  public int getAces()
  {
    return aces;
  }//end getter for aces

  public void setAces(int aces)
  {
    this.aces = aces;
  }//end setter for aces

  public int getSets()
  {
    return sets;
  }//end getter for sets

  public void setSets(int sets)
  {
    this.sets = sets;
  }//end setter for sets


  //brain methods
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