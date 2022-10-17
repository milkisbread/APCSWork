public class Greetings
{
  public static void greetings(String str){
    System.out.println(name(str));
  }

  public static String name(String str){
    return "hello " + str + ", how are you?";
  }

  public static void main(String[] args){
    greetings("Chloe");
    greetings("Dr. Kessner");
  }
}
