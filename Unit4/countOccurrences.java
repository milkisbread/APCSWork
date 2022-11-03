public class countOccurrences{

  public static void testcountOccur(String str, int expected){
    int outcome = countOccur(str);
    System.out.println(str + " " + expected + " " + outcome);

    if(expected == outcome){
      System.out.println("Repeats ma " + outcome + " times");
    }else{
      System.out.println("Doesn't Repeat ma " + outcome + " times");
    }
  }

  public static int countOccur(String str){
    int count = 0;
    for(int i = 0; i < str.length()-1; i++){
      if(str.substring(i, i+2).equals("ma")){
      count++;
      }
    }
    return count;
  }

  public static void main(String[] args){
    testcountOccur("mama", 2);
    testcountOccur("lamamama", 3);
  }

}
