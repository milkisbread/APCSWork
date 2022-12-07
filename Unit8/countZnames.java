import java.util.*;

public class countZnames{

  public static void testcountZ(ArrayList<String> words, double expected){

    double result = countZ(words);
    System.out.print("words: ");
    for(String word: words){
      System.out.println(word + " ");
    }
    System.out.println("expected length: " + expected + " result: " + result);

    if(expected == result){
      System.out.println("It's equal!");
    }else{
      System.out.println("not equal");
    }
  }

  public static int countZ(ArrayList<String> words){
    int result = 0;
    for(int i = 0; i < words.size(); i++){
      String firstone = words.get(i).substring(0,1);
      if(firstone.equals("z") || firstone.equals("Z")){
        result += words.get(i).length();
      }
    }
    return result;
  }

  public static void main(String[] args){
    ArrayList<String> words = new ArrayList<String>();
    words.add("zebra");
    words.add("Zootopia");
    words.add("Zambia");

    testcountZ(words, 19);
  }

}
