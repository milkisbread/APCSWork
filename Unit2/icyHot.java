public class icyHot
{
  public static void testicyHot(int temp1, int temp2, boolean expected){
    boolean result = icyhot(temp1, temp2);
    System.out.println("temp1:" + temp1 + "temp2:" + temp2 + "expected" + expected + "result" + result);

    if(result == expected){
      System.out.println("ICYHOT!!");
    }else{
      System.out.println("not icyhot...");
    }
  }
  public static boolean icyhot(int temp1, int temp2)
  {
    if((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0))
    {
      return(true);
    }else
    {
      return(false);
    }
  }
  public static void main(String[] args)
  {
    testicyHot(101, -18, false);
    testicyHot(-57, 139, true);
  }
}
