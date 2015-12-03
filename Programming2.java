import java.util.*;

public class Programming2{
  public static void main(String[] args) {
    
    Scanner console = new Scanner(System.in);
    
    favoriteLetter(console, "y");
  }
  
  public static void printTwoDigits(int n){
    String str = "no 42 was seen";
    String a = "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!";
    for (int i=1;i<=n;i++){
      int num = (int) (90*Math.random())+10;
      System.out.println(num);
      if(num==42){str = "we found a 42!"; System.out.println(a);}
      else {str=str;}
    }
    
    System.out.print(str);
  }
  
  public static void favoriteLetter(Scanner word, String letter){
    int count = 0;
    System.out.print("Type a word: ");
    String str=""; 
    
    while (count<2) {
      str = word.next();
      if (str.substring(0,1).equals(letter)) {count++;}
      else {count=0;} 
      System.out.print("Type a word: ");
     
    }
    System.out.print(letter + " is for " + str);
  }
  
}