public class Programming8 {
  
  public static void main(String[]args) {
    lucky(4); 
    randomRects();
  }
  
  public static void lucky(int min) {
    
    int count =0;
    int count2= 0;
    int r ;
    while (count<4) {
      r = (int) (6*Math.random())+1;
      System.out.print(r +" ");
      if (r<=min) {count++;count2++;}
      else {count = 0; count2++;}
      
    }
    System.out.println(" ");
    System.out.println("it took " + count2 + " times");
  }
  
  public static void randomRects() {
    int c = 0;
    int w, h, area1, area2;
    
    //first rect initiate
    w = (int) (10*Math.random())+1;
    h = (int) (10*Math.random())+1;
    area1 = h*w;
    System.out.println("w: " + w + ", h: " + h + ", area: " + area1);
    
    //testing phase
    while (c<4) {
      w = (int) (10*Math.random())+1;
      h = (int) (10*Math.random())+1;
      area2 = h*w;
      System.out.println("w: " + w + ", h: " + h + ", area: " + area2);
      if (area2>area1) {c++; area1 = area2;}
      else {c=0; area1 = area2;}
    }
    
    System.out.print("4 rectangles of increasing areas");
  }
}
