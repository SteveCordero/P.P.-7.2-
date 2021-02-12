public class Sports
{
  public String sport;
  public String team;
  public int score;
  public boolean isTeam;
  public boolean isWinner;

  //Constructors
  public Sports(String sport, String team, int score, boolean isTeam, boolean isWinner)
  {
    this.team = team;
    this.sport = team;
    this.score = score;
    this.isTeam = isTeam;
    this.isWinner = isWinner;
  }//end constructor

  //toString
  public String toString()
  {
    return "Team = " + team + 
            "\nSport = " + sport +
            "\nScore = " + score +
            "\nIs it a Team Sport = " + isTeam +
            "\nDid they win = " + isWinner;
  }
}