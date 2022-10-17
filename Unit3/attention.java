public class attention
{
  public static void Attention(String str){
    boolean result = shout(str);
    System.out.println(result);
  }

  public static boolean shout(String str){
    if(str.length() >= 8 && str.substring(0,9).equals("Hey, you!")){
      return true;
    }else{
      return false;
    }
  }

  public static void main(String[] args){
    Attention("Hey, you! Stop talking in class!");
    Attention("Hey, you! Don't run in the hallways!");
  }
}
