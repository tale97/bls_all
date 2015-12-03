//Name: Tuan Le
public class Roulette
{
  private int pocket;
  public static int numOfGames=0;
  public Roulette(){ 
    pocket=0;
  }
  
  // Spin the roulette by
  //generating random number integer from 0-37 inclusive and
  //updating pocket and numOfGames.
  public void spin(){ 
    pocket = (int) (38*Math.random());
    numOfGames++;
  }
  
  public static void printWelcome(){
    System.out.println("Welcome to BetOnGreen,");
    System.out.print("the game where you can bet on any color as long as "); 
    System.out.println("it is green.");
  }
  
  
  //determine who wins the game
  //prints out name of winner.
  public static void winner(Gambler a, Gambler b){ 
    if (a.getbalance() <= 0) {
      System.out.println(b.name);
    } else {
      System.out.println(a.name);
    }
  }
  
  public int getpocket() {
    return pocket;
  }
  
}