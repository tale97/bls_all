public class Programming4{
/*Write a static method named countVowels that accepts a string as a parameter and return 

the number of vowels that appear in the string. Vowels consist of the letters a, e, i, o, and u. 

You may assume that all letters are lowercase. 

countVowels(“this is a test.”); returns 4

countVowels(“you won’t do well.”); returns 5


Write a static method named replace that accepts three string parameters a, b and c. The 

method return a new string which replaces every occurrence of the string b in the string a 

with the string c. If the string b is not found in a, return a unchanged. 

replace (“did Hannah see bees? Hannah did”, “Hannah”, “Mila” ) returns 

“did Mila see bees? Mila did”

replace (“did Hannah see bees? Hannah did”, “Sarah”, “Mila” ) returns 

“did Hannah see bees? Hannah did”


Write a static method named changeSpace that accepts two string parameters a and b . The 

method return a new string which replaces every occurrence of the space in the string a with 

the string b. You MUST use replace above for full credit. 

changeSpace(“You had me at hello, world!”, “*”); returns

“You*had*me*at*hello,*world!;

changeSpace(“You had me at hello, world!”, “Java”); returns

“YouJavahadJavameJavaatJavahello,Javaworld!”*/
  
  public static void main(String[]args) {
    System.out.println(countVowels("lets see how this works out"));
    System.out.println(replace("lets see how this works out","o","a"));
    System.out.println(changespace("lets see how this works out","*"));
  }
 
  public static int countVowels(String str) {
   int count = 0;
   
   for (int i=0;i<=(str.length()-1);i++) {
    if (str.substring(i,i+1).equals("a") || 
        str.substring(i,i+1).equals("e") ||
        str.substring(i,i+1).equals("i") ||
        str.substring(i,i+1).equals("o") ||
        str.substring(i,i+1).equals("u")) {count++;}
   
     /*if ("aeiou".contains(str.substring(i, i+1)))
       count++; (the superior way)*/
   }  
   return count;
  }
  
   public static String replace(String a, String b, String c) {
    int index = a.indexOf(b);
    
    while (index!=-1) {
      a=a.substring(0,index)+c+a.substring(index+b.length());
      index = a.indexOf(b);
    }
    return a;
  }
  
  public static String changespace(String a, String b)
  { return replace(a," ", b);
  }

}