//Name: Tuananh
public class Gambler
{
  String name;
  private double balance;
  boolean isHouse;
  
  
  public Gambler(String a, double b, boolean c)
  {name = a; balance = b; isHouse = c;
    
  }
  
  //current player wins the game
  //update their balance total
  public void winGame()
  {if (isHouse) {balance+=1;}
    else {balance+=12;}
    
  }
  
  //current player loses the game
  //update their balance total
  public void loseGame()
  {if (isHouse) {balance-=12;}
    else {balance-=1;}
    
  }
  
  public double getbalance() {return balance;}
}