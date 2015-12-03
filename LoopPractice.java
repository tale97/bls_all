public class LoopPractice {
  
  public static void main(String[] args){
    for (int i=3; i<=55; i+=3){
      System.out.print(i+", ");
    }
    
    System.out.println();

    
    for (int y=4; y<=100; y+=4){
      if (y%5!=0) {
        System.out.print(y+ ", ");
      }
    }
     System.out.println();

    multOf3(7,18);
     System.out.println();
    
   
    multOf4Not5(150);
  }
  
  public static void multOf3(int x, int y) {
    for (int i = x; i<=y; i++){
      if (i%3==0){
       System.out.print(i +", ");
      }
    }
  }
  public static void multOf4Not5(int x) {
    for (int i = 4; i<=x; i++){
      if (i%4==0 && i%5 != 0){
       System.out.print(i+", ");
      }
    }
  }
}