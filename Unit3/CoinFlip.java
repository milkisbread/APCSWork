public class CoinFlip
{
  public static void main(String[] args)
  {
    for (int i = 0; i < 10; i++){
      if((Math.random() * 2) > 1){
        System.out.println("Tails");
      }else{
        System.out.println("Heads");
      }
    }
  }
}
