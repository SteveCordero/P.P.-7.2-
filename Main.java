class Main 
{
  public static void main(String[] args) 
  {
    Basketball Lakers = new Basketball("Basketball", "Lakers", 108 , true, true, 10 , 20, 43, 8, "Lebron James");

    Tennis Federer = new Tennis("Tennis", "Roger Federer", 6, false, true, 4, 8, 10, true);

    System.out.println("Steve Cordero P.P. 7.2");
    System.out.println("-----Testing Basketball Class-----\n");
    System.out.println(Lakers.toString());
    System.out.println(Lakers.gameStart());
    System.out.println(Lakers.maxPlayers());
    System.out.println("\n-----Testing Tennis Class-----\n");
    System.out.println(Federer.toString());
    System.out.println(Federer.gameStart());
    System.out.println(Federer.maxPlayers());
  }//end main method
}//end main class aka the driver