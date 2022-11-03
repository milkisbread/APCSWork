public class reverse{

  public static void testReverse(String str, String expected){
    String outcome = Reverse(str);
    System.out.println(str + " expect: " + expected + " result: " + outcome);

    if(expected.equals(outcome)){
      System.out.println("reversed!");
    }else{
      System.out.println("not reversed...");
    }
  }

  public static String Reverse(String str){
    String result = "";
    for(int i = str.length()-1; i >= 0; i--){
      result += str.substring(i, i+1);
    }
    return result;
  }

  public static void main(String[] args){
    testReverse("redrum" , "murder");
    testReverse("stressed desserts", "stressed desserts");
  }
}
