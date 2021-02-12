class Main 
{
  public static void main(String[] args) 
  {
    Sports ruggleball = new Sports("Ruggleball","Smoothies", 55 , true, false);

    Basketball Lakers = new Basketball("Basketball", "Lakers", 108 , true, true, 10 , 20, 43, 8, "Lebron James");

    Tennis Federer = new Tennis("Tennis", "Roger Federer", 6, false, true, 4, 8, 10);

    System.out.println(ruggleball.toString());
    System.out.println("\n------------------------\n");
    System.out.println(Lakers.toString());
    System.out.println(Lakers.gameStart());
    System.out.println("\n------------------------\n");
    System.out.println(Federer.toString());
  }//end main method
}//end main class aka the driver