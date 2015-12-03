//Name: Tuananh

/* The Roulette wheel has 38 pockets numbered 0-37.
 * 0 and 19 Green.
 * 1-18 Red
 * 20-37 Black
 * Simulate one match between a player and the house.
 * Player will always bet $1 on Green. 
 * Player wins $12 if ball lands on Green.
 * Player loses $1 if ball lands on either Red or Black.
 * Both the house and the player starts out with $50.
 * Match ends when the player or the house lost all of his money.
 * You MUST USE BetOnGreen, Gambler, Roulette Java files.
 * You can add to the code but can not remove any code.
 * 
 * MODIFY: Once the game works. Simulate 100 matches and count the number 
 * of times the player wins. 
 */


public class BetOnGreen{
  
  public static void main(String[] args)
  {
    Roulette g=new Roulette();
    Gambler player=new Gambler("Mike",50,false);
    Gambler house=new Gambler("Foxwoods",50,true);
    
    double winrate;
    int matchCount = 0;
    int houseWins=0;
    int playerWins=0;
    //print welcoming screen from Roulette class.
    Roulette.printWelcome();
    
    
    //play the match
    for (int i = 1; i<=10000; i++) {
      player=new Gambler("Mike",50,false);
      house=new Gambler("Foxwoods",50,true);
      
      while (player.getbalance() > 0 && house.getbalance() > 0) {
        g.spin();
        if (g.getpocket() == 0 || g.getpocket() == 19) {player.winGame(); house.loseGame();}
        else {player.loseGame(); house.winGame();}
      } 
      matchCount++; if (player.getbalance() <= 0) {houseWins++;}
      else if (house.getbalance() <= 0) {playerWins++;}
    }
    
    System.out.println("Total matches: " + matchCount);
    System.out.println("House won " + houseWins);
    System.out.println("Player won " +playerWins);
    
    //prints out the name of the winner of the match
    //and the number of games. Must call winner method.
    Roulette.winner(player,house);
    System.out.println("number of games: " + Roulette.numOfGames);
    winrate=(double)(((double)playerWins/(double)matchCount)*100);
    System.out.println("Winrate for player: " + winrate + "%");
    
  }
  
}
