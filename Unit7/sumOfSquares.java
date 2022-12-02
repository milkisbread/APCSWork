public class sumOfSquares{

  public static void testSumSquares(double[] nums, double expected){
    double outcome = sumSquares(nums);
    System.out.println(" " + expected + " " + outcome);

    if(expected == outcome){
      System.out.println("It's equal!");
    }else{
      System.out.println("not equal");
    }
  }

  public static double sumSquares(double[] nums){
    double result = 0;
    for(int i = 0; i <= nums.length; i++){
      result = (nums[i]*nums[i]);
    }
    return result;
  }

  public static void main(String[] args){
    double[] nums = new double[3];
    nums[0] = 1;
    nums[1] = 2;
    nums[2] = 3;
    double[] nums2 = new double[3];
    nums2[0] = 2;
    nums2[1] = 4;
    nums2[2] = 6;
    testSumSquares(nums, 14);
    testSumSquares(nums2, 56);
  }
}
