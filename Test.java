
public class Test{

  
  public static void main (String[] args) {
   int [] num = {1, 6, 8, 7, 0, 0};
    System.out.print(arrayLike(num, 8));
  }
public static boolean arrayLike(int[] nums, int value) {
  int inRange = 0;
  for (int i=0; i<nums.length; i++) {
    if ((nums[i] >= value-2) && (nums[i] <= value+2)) {
      inRange++;
    }
  }
  return (inRange >= (nums.length + 1)/2);
}
}