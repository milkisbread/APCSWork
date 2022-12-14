import java.util.*;

public class findMax{

  public static void testBiggest(ArrayList<Integer> nums, double expected){
    double result = biggest(nums);

    System.out.println("values: ");
    for(double num: nums){
      System.out.println(num + " ");
    }

    System.out.println("expected: " + expected + " result: " + result);
    if(expected == result){
      System.out.println("Matches");
    }else{
      System.out.println("No Match");
    }

  }

  public static double biggest(ArrayList<Integer> nums){
    double result = 0;
    for(int i = 0; i < nums.size(); i++){
      result = Math.max(nums.get(i), nums.get(i));
    }
    return result;
  }

  public static void main(String[] args){
    ArrayList<Integer> nums = new ArrayList<Integer>();
    nums.add(5);
    nums.add(10);
    nums.add(15);
    nums.add(20);

    testBiggest(nums, 20);
  }

}
