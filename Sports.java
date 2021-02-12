public class Sports
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

  //Brain Method
  public String gameStart()
  {
    return sport + " starts off with a coin toss";
  }//end brain method

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