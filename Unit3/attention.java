public class attention
{
  public static void testAttention(String str){
    boolean result = attention(str);
    System.out.println(result);

    if (result == true){
      System.out.println(str);
    }else{
      System.out.println("Hey!");
    }
  }

  public static boolean attention(String str){
    if(str.substring(0,9).equals("Hey, you!")){
      return true;
    }else{
      return false;
    }
  }

  public static void main(String[] args){
    testAttention("Hey, you! Stop talking in class!");
    testAttention("Hey, you! Don't run in the hallways!");
  }
}
