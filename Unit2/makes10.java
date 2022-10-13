public class makes10
{
  public static void testmakes10(int a, int b, boolean expected)
  {
    boolean result = Makes10(a, b);
    System.out.print(" a: " + a + " b: " + b + " expected: " + expected + " result: " + result);

    if (result == expected){
      System.out.println(" YAY!");
    }else{
      System.out.println(" Booooo");
    }
  }
  public static boolean Makes10(int a, int b){
  if(a==10 || b==10 || a+b==10){
    return true;
  }else{
    return false;
  }
  }
  public static void main(String[] args)
  {
    testmakes10(6,10,true);
    testmakes10(3,7, true);
    testmakes10(10, 0, true);
  }
}
