public class countZnames{

  public static void testcountZ(String[] words, double expected){

    double result = countZ(words);
    System.out.println("expected: " + expected + " result: " + result);

    if(expected == result){
      System.out.println("It's equal!");
    }else{
      System.out.println("not equal");
    }
  }

  public static int countZ(String[] words){
    int count = 0;
    for(int i = 0; i < words.length; i++){
      String firstone = words[i].substring(0,1);
      if(firstone.equals("z") || firstone.equals("Z")){
        count ++;
      }
    }
    return count;
  }

  public static void main(String[] args){
    String[] words = new String[3];
    words[0] = "zebra";
    words[1] = "Zootopia";
    words[2] = "Zambia";
    String[] words2 = new String[3];
    words2[0] = "Me";
    words2[1] = "Myself";
    words2[2] = "AndI";
    testcountZ(words, 3);
    testcountZ(words2, 0);
  }

}
