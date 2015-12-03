import java.util.*;
public class StringProblem
{
  

  public static void main(String[] args)
  { Scanner input = new Scanner(System.in);
   String string = input.nextLine();
  input.close();  
  
  System.out.println(countSpaces(string));
   System.out.println(catDog(string));
  }
  
 public static int countSpaces(String str)
  { int count = 0;
    int index = str.indexOf(" ");
     
    while (index!=-1) {
      count++;
      str = str.substring(index+1);
      index = str.indexOf(" ");
    }
   return count;
  }
  
// Method returns the number of spaces in str.
  //count the number of times b occurs in a.
  public static int countWords(String a, String b)
  { int count = 0;
    int index = a.indexOf(b);
   
   while (index!=-1) {
       count++;
       a = a.substring(index+b.length());
       index = a.indexOf(b);       
   }
    return count;
  }
  
    
  //return true if str has the same number of occurences of 
  // "cat" and "dog". 
  // Must Use countWords!!
  public static boolean catDog(String str)
  { int cat = countWords(str,"cat");
   int dog = countWords(str,"dog");
   if (dog==cat) {
       return true;}
   else {return false;}  
  }
}