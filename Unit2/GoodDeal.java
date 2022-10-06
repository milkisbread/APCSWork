public class GoodDeal{
  public static void testGoodDeal(double originalPrice, double salePrice){
    boolean result = goodDeal(originalPrice, salePrice);

    if(result == true){
      System.out.println("DEAL");
    }else{
      System.out.println("NO DEAL");
    }
  }

  public static boolean goodDeal(double originalPrice, double salePrice){
    if(salePrice <= originalPrice*.75){
      return(true);
    }else{
      return(false);
    }
  }
  public static void main(String[] args){
    testGoodDeal(100, 75);
    testGoodDeal(50, 40);
  }
}
