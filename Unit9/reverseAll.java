import java.util.*;

public class reverseAll{

  public static ArrayList<String> reverse(ArrayList<String> words){
    ArrayList<String> result = new ArrayList<String>();

    for(String word: words){
      String empty = "";
      for(int i = word.length(); i > 0; i--){
        empty += word.substring(i-1, i);
      }
      result.add(empty);
    }
    return result;
  }

  public static void main(String[] args){
    ArrayList<String> words = new ArrayList<String>();
    words.add("potato");
    words.add("tomato");
    words.add("lettuce");

    System.out.println("words: " + reverse(words));
  }

}
