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
  }

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
  } 
}