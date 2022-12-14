import java.util.*;

public class filterGoodScores{

  public static ArrayList<Integer> GoodScores(ArrayList<Integer> grades){
    ArrayList<Integer> result = new ArrayList<Integer>();

    for(int i = 0; i < grades.size(); i++){
      if (grades.get(i) >= 90){
        result.add(grades.get(i));
      }
    }
    return result;
  }

  public static void main(String[] args){
    ArrayList<Integer> grades = new ArrayList<Integer>();
    grades.add(100);
    grades.add(87);
    grades.add(79);
    grades.add(93);

    System.out.println("values: " + GoodScores(grades));
  }

}
