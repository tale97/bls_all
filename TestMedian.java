public class TestMedian {
  public static void main(String[] args) {
    System.out.println(median(7,3,9));
    System.out.println(median(29,-14,11));
    System.out.println(median(752,64,121));
    System.out.println(median(1,2,2));
  }
  
  public static int median(int x, int y, int z) {
    if ((x<=y && x>=z) || (x>=y && x<=z)) {
      return x;
    }else if ((y>=x && y<=z) || (y<=x && y>=z)) {
      return y;
    }else {
      return z;
    }
   
  
  
  }}
   

