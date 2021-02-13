class Basketball extends Sports
{
  private int threePointers;
  private int freeThrows;
  private int passes;
  private int fouls;
  private String gameMVP;

  //Constructor
  public Basketball(String sport, String team, int score, boolean isTeam, boolean isWinner, int threePointers, int freeThrows, int passes, int fouls, String gameMVP)
  {
    super(sport, team, score, isTeam, isWinner);
    this.threePointers = threePointers;
    this.freeThrows = freeThrows;
    this.passes = passes;
    this.fouls = fouls;
    this.gameMVP = gameMVP;
  }//end constructor

  //Setters and Getters
  public int getThreePointers()
  {
    return threePointers;
  }//end getter for threePointers

  public void setThreePointers(int threePointers)
  {
    this.threePointers = threePointers;
  }//end setter for threePointers

  public int getFreeThrows()
  {
    return freeThrows;
  }//end getter for freeThrows

  public void setFreeThrows(int freeThrows)
  {
    this.freeThrows = freeThrows;
  }//end setter for freeThrows

  public int getPasses()
  {
    return passes;
  }//end getter for passes

  public void setPasses(int passes)
  {
    this.passes = passes;
  }//end setter for passes

  public int getFouls()
  {
    return fouls;
  }//end getter for fouls

  public void setFouls(int fouls)
  {
    this.fouls = fouls;
  }//end setter for Fouls

  public String getGameMVP()
  {
    return gameMVP;
  }//end getter for gameMVP

  public void setGameMVP(String gameMVP)
  {
    this.gameMVP = gameMVP;
  }//end setter for gameMVP

  //Brain method
  public String gameStart()
  {
    return super.getSport() + " starts off with a tipoff";
  }//end overridden method

  public String maxPlayers()
  {
    return "There can be a total of 5 players per team";
  }//end 
  //toString
  public String toString()
  {
    String output = super.toString();
    output += "\nThree Pointers = " + threePointers +
              "\nFreeThrows = " + freeThrows +
              "\nPasses = " + passes +
              "\nFouls = " + fouls +
              "\nGame MVP = " + gameMVP;
    return output;
  }//end toString
}//end Class Basketball