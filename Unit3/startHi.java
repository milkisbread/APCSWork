public class startHi
{
  public static void testbegHi(String str){
    boolean result = begHi(str);
    System.out.println(str + result);
  }

  public static boolean begHi(String str){
    if (str.length() < 2){
      return false;
    }

    String firstTwo = str.substring(0,2);

    if (firstTwo.equals("hi")){
      return true;
    }else{
      return false;
    }
  }

  public static void main(String[] args){
    testbegHi("hi Dr. Kessner! ");
    testbegHi("hi everyone! ");
  }
}
