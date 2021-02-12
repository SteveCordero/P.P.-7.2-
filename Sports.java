public class Sports
{
  public String sport;
  public String name;//team or player name
  public int score;
  public boolean isTeam;
  public boolean isWinner;

  //Constructors
  public Sports(String sport, String name, int score, boolean isTeam, boolean isWinner)
  {
    this.sport = sport;
    this.name = name;
    this.score = score;
    this.isTeam = isTeam;
    this.isWinner = isWinner;
  }//end constructor

  //toString
  public String toString()
  {
    return "Sport = " + sport + 
            "\nName = " + name +
            "\nScore = " + score +
            "\nIs it a Team Sport = " + isTeam +
            "\nDid they win = " + isWinner;
  }
}