public class frontTimes{

  public static void testfronttimes(String str, int n, String expected){
    String outcome = fronttimes(str, n);
    System.out.println(str + " " + expected + " " + outcome);

    if(expected.equals(outcome)){
      System.out.println("Yayyyy");
    }else{
      System.out.println("aw man");
    }
  }
  public static String fronttimes(String str, int n){
    int frontLen = 3;
    if(frontLen > str.length()){
      frontLen = str.length();
    }
    String front = str.substring(0, frontLen);

    String result = "";
    for (int i = 0; i<n; i++){
      result = result + front;
    }
      return result;
  }

  public static void main(String[] args){
    testfronttimes("computer", 3, "comcomcom");
    testfronttimes("allie", 4, "allallallall");
  }
}
