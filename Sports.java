public abstract class Sports
{
  private String sport;
  private String name;//team or player name
  private int score;
  private boolean isTeam;
  private boolean isWinner;

  //Constructors
  public Sports(String sport, String name, int score, boolean isTeam, boolean isWinner)
  {
    this.sport = sport;
    this.name = name;
    this.score = score;
    this.isTeam = isTeam;
    this.isWinner = isWinner;
  }//end constructor

  //Getters and Setters
  public String getSport()
  {
    return sport;
  }//end getter for String sport
  public void setSport(String sport)
  {
    this.sport = sport;
  }//end setter for String sport

  public String getName()
  {
    return name;
  }//end getter for String name

  public void setName(String name)
  {
    this.name = name;
  }//end setter for String name

  public int getScore()
  {
    return score;
  }//end getter for int score

  public void setScore(int score)
  {
    this.score = score;
  }//end setter for int score

  public boolean getIsTeam()
  {
    return isTeam;
  }//end getter for isTeam

  public void setIsTeam(boolean isTeam)
  {
    this.isTeam = isTeam;
  }//end setter for isTeam
  
  public boolean getIsWinner()
  {
    return isWinner;
  }//end getter for isWinner

  public void setIsWinner(boolean isWinner)
  {
    this.isWinner = isWinner;
  }//end setter for isWinner

  //Brain Methods
  public String gameStart()
  {
    return sport + " starts off with a coin toss";
  }//end brain method

  public abstract String maxPlayers();//abstract method

  //toString
  public String toString()
  {
    return "Sport = " + sport + 
            "\nName = " + name +
            "\nScore = " + score +
            "\nIs it a Team Sport = " + isTeam +
            "\nDid they win = " + isWinner;
  }
}//end Sports Class