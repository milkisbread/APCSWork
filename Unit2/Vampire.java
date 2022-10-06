public class Vampire
{
  public static void testisVampire(float hour, boolean awake)
  {
    boolean result = isvampire(hour, awake);
    System.out.print(" hour: " + hour + " status: " + awake + " vampire?: " + result);

    if(result == true){
      System.out.println(" VAMPIRE!");
    }else{
      System.out.println(" Human:)");
    }
  }

  public static boolean isvampire(float hour, boolean awake)
  {
    if((hour > 6 && hour < 22) && awake == false){
      return(true);
    }else if((hour > 6 && hour < 22) && awake == true){
      return(false);
    }else if((hour < 6 && hour > 22) && awake == false){
      return(false);
    }else{
      return(true);
    }
  }

  public static void main(String[] args){
    testisVampire(11, false);
    testisVampire(23, true);
  }
}
