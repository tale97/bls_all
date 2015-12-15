import java.util.*;
public class Programming7 {
  public static void main(String[] args) {
  int[] b={-3,10,7,10,10,2};
  withoutTen(b);
  System.out.println(Arrays.toString(b));
    int[] a = {10,0,3,10,0,5,0};
    zeroFront(a);
    System.out.println(Arrays.toString(a));
  }
  
  public static void shiftLeft(int[] a){
    int t=a[0];
    
    for (int i=0;i<a.length-1;i++) {
     a[i]=a[i+1]; 
    }
    a[a.length-1]=t;
  }
  
  
  public static void shiftLeftAtI(int[] a, int b){
    for (int i=b;i<a.length-1;i++) {
     a[i]=a[i+1];
    }
    a[a.length-1]=0;
  }
  
  public static void withoutTen(int[]a) {
    for (int i=0;i<a.length;i++)
    {if(a[i]==10) {shiftLeftAtI(a,i);}
      
    }

  }
  
  public static void moveRightAtI(int[]a, int b) {
    for (int i=b;i>0;i--) {
      a[i]=a[i-1];
    }
    a[0]=0;
  }
  
  public static void zeroFront(int[]a) {
    for(int i=0; i<a.length;i++) {
      if(a[i]==0){moveRightAtI(a, i);}
    }
    
  }
    
    
}
