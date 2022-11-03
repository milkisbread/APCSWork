public class factorial{

  public static void testFactorial(int n, int expected){
    int outcome = Factorial(n);
    System.out.println(n + " " + expected + " " + outcome);

    if(expected == outcome){
      System.out.println("It's equal!");
    }else{
      System.out.println("not equal");
    }
  }

  public static int Factorial(int n){
    int result = 1;
    for(int i = 1; i <= n; i++){
      result *= (i);
    }
    return result;
  }

  public static void main(String[] args){
    testFactorial(4, 24);
    testFactorial(3, 6);
  }

}
