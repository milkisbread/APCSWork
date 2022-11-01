public class stringSplosion{

  public static void testSplosion(String str, String expected){
    String outcome = Splosion(str);
    System.out.println(str + " " + expected + " " + outcome);

    if(expected.equals(outcome)){
      System.out.println("PASS!!");
    }else{
      System.out.println("Fail...");
    }
  }

  public static String Splosion(String str){
    String result = "";
    for (int i = 0; i<str.length(); i++){
      result = result + str.substring(0, i+1);
    }
    return result;
  }

  public static void main(String[] args){
    testSplosion("atom", "aatatoatom");
    testSplosion("chloe", "cchchlchlochloe");
  }
}
