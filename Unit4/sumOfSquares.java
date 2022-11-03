public class sumOfSquares{

  public static void testSumSquares(int n, int expected){
    int outcome = SumSquares(n);
    System.out.println(n + " " + expected + " " + outcome);

    if(expected == outcome){
      System.out.println("It's equal!");
    }else{
      System.out.println("not equal");
    }
  }

  public static int SumSquares(int n){
    int result = 0;
    for(int i = 0; i <= n; i++){
      result += (i*i);
    }
    return result;
  }

  public static void main(String[] args){
    testSumSquares(4, 30);
    testSumSquares(5, 55);
  }
}
