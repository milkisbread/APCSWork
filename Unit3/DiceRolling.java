public class DiceRolling{
  public static void main(String[] args){
    int min = 1;
    int max = 6;
    for (int i = 0; i < 10; i++){
      int rand = (int)(Math.random()* (max-min + 1) + min);
      System.out.println(rand);
    }
  }
}
