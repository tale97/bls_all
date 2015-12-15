public class Programming6 {
  
  public static void main(String[] args) {
    int[]a={1,2,3,4,5};
    System.out.println(only14(a));
  }
  
  public static boolean only14(int[] a){
    for(int i =0; i<a.length; i++){
      if(a[i]!=1&&a[i]!=4){return false;}
    }
    return true;
  }
  
  public static boolean no14(int[] a) {
    boolean isdere1 = false;
    boolean isdere4 = false;
    
    for(int i =0; i<a.length; i++){
      if(a[i]==1) {isdere1=true;}
      if(a[i]==4) {isdere4=true;}
    }
    if(isdere1==true&&isdere4==true) {return false;}
    else {return true;}
  } 
  
  public static boolean isEveryWhere(int[] a, int b) {
    for(int i =0; i<(a.length-1); i++){
      if(a[i]!=b && a[i+1]!=b) {return false;}
    }
    return true;
  }
  
  public static boolean tripleUp(int[]a){
    for (int i=0; i<(a.length-2);i++) {
      if(a[i]==(a[i+1]-1) && a[i+1]==(a[i+2]-1)) {return true;}
    }
    return false;
  }  
  
}
