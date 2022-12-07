import java.util.*;

public class countLucky{
  public static void testLuck(ArrayList<Integer> numbers, int expected){
    int result = Lucky(numbers);
    System.out.println("numbers: ");
    for (int value: numbers){
      System.out.println(value);
    }
    System.out.println("expected: " + expected + " result: " + result);
    if(expected == result){
      System.out.println("Yay!");
    }else{
      System.out.println("nope");
    }
  }

  public static int Lucky(ArrayList<Integer> numbers){
    int count = 0;
    for(int i=0; i<numbers.size(); i++){
      if((numbers.get(i) == 7) || (numbers.get(i) % 7 == 0) || (numbers.get(i) % 10 == 7)){
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args){
      ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        testLuck(numbers, 0);
    }
}
