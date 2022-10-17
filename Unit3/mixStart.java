public class mixStart
{
  public static void testixStart(String str){
    boolean result = ixStart(str);
    System.out.println(str + result);

  }

  public static boolean ixStart(String str){
    if (str.length() < 3){
      return false;
    }

    String firstThree = str.substring(1,3);

    if(firstThree.equals("ix")){
      return true;
    }else{
      return false;
    }
  }

  public static void main(String[] args){
    testixStart("mix salad ");
    testixStart("six twinkies ");
  }
}
