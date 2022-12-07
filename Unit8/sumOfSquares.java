import java.util.*;

public class sumOfSquares{

  public static void testSumSquares(ArrayList<Integer> numbers, double expected){
    double outcome = sumSquares(numbers);

    System.out.println("values: ");
    for(double number: numbers){
      System.out.println(number + " ");
    }
    System.out.println("expected: " + expected + " result: " + outcome);

    if(expected == outcome){
      System.out.println("It's equal!");
    }else{
      System.out.println("not equal");
    }
  }

  public static double sumSquares(ArrayList<Integer> numbers){
    double result = 0;
    for(int i = 0; i < numbers.size(); i++){
      result += (numbers.get(i)*numbers.get(i));
    }
    return result;
  }

  public static void main(String[] args){
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);

    testSumSquares(numbers, 14);
  }
}
