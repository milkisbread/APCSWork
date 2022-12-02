public class countLucky{

  public static void testLuck(int[] nums, int expected){
    int result = Lucky(nums);
    System.out.println("expected: " + expected + " result: " + result);
    if(expected == result){
      System.out.println("Yay!");
    }else{
      System.out.println("nope");
    }
  }

  public static int Lucky(int[] nums){
    int count = 0;
    for(int i=0; i<nums.length; i++){
      if((nums[i] == 7) || (nums[i] % 7 == 0) || (nums[i] % 10 == 7)){
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args){
    int[] nums = new int[3];
    nums[0] = 1;
    nums[1] = 2;
    nums[2] = 3;
    int[] nums2 = new int[3];
    nums2[0] = 7;
    nums2[1] = 13;
    nums2[2] = 17;

    testLuck(nums, 0);
    testLuck(nums2, 2);
  }
}
