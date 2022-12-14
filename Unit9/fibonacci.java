import java.util.*;

public class fibonacci{

  public static ArrayList<Integer> sequence(int n){
    ArrayList<Integer> result = new ArrayList<Integer>();

    int a = 1, b = 1;
    result.add(a);
    result.add(b);
    for(int i=0; i < n-1; i++)
    {
      result.add(a+b);
      b = a+b;
      a = b-a;
    }
    return result;
  }

  public static void main(String[] args){
    System.out.println("values: " + sequence(2));
  }

}
