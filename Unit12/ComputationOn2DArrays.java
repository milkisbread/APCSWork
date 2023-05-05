public class ComputationOn2DArrays{

  public static int findMin(int[][] values){
    System.out.println("Smallest Number in the Array: ");
    int result = values[0][0];
    for(int i = 0; i < values.length; i++){
      for(int j = 0; j < values.length; j++){
        if(values[i][j] < result){
          result = values[i][j];
        }
      }
    }
    return result;
  }

  public static int Sum(int[][] values){
    System.out.println("Sum of 2D Array of Floats: ");
    int outcome = 0;
    for(int i = 0; i < values.length; i++){
      for(int j = 0; j < values.length; j++){
        outcome += values[i][j];
      }
    }
    return outcome;
  }

  public static int Animals(String[][] words){
    System.out.println("Words That Start wiith an 'A'");
    int count = 0;
    for(int i = 0; i < words.length; i++){
      for(int j = 0; j < words.length; j++){
        String first = words[i][j].substring(0,1);
        if(first.equals("A")){
          count ++;
        }
      }
    }
    return count;
  }

  public static void main(String[] args){
    int[][] values = { {3, 7, 2}, {5, 6, 8}, {1, 4, 9} };

    int result = findMin(values);
    System.out.println(result);

    int outcome = Sum(values);
    System.out.println(outcome);

    String[][] words = { {"Alligator", "Owl", "Dog"}, {"Axolotol", "AntEater", "Butterfly"}, {"Armadillo", "Otter", "Giraffe"} };

    System.out.println(Animals(words));
/*
      float[] sums = {1, 2, 3, 4};
      System.out.println("Sum of 2D Array of Floats: ");
      float result = 0;
      for(int i = 0; i < sums.length; i++){
        result += sums[i];
      }
      System.out.print(result);

      String[] words = {"Alligator", "Owl", "AntEater", "Otter", "Axolotol"};
      System.out.println("Words that Start with an A");
      for(int i = 0; i < words.length; i++){
        String first = words[i].substring(0,1);
        if(first.equals("A")){
          System.out.print(words[i]);
        }
      }
*/
    }
}
