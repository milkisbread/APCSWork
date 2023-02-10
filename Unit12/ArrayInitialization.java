public class ArrayInitialization{

  public static void main(String[] args){
         // create an array:
         // 1 0 0 0 0
         // 0 1 0 0 0
         // 0 0 1 0 0
         // 0 0 0 1 0
         // 0 0 0 0 1

         int n = 10;
         int[][] cells = new int[n][n];

         for (int i=0; i<n; i++){
             for (int j=0; j<n; j++){
               if (i == j){
                 cells[i][j] = 1;
               }else{
                 cells[i][j] = 0;
              }
             }
         }

         System.out.println("cells:");

         for (int[] row : cells){
             for (int value : row){
                 System.out.print(value + " ");
             }
             System.out.println();
         }

         String[][] animals = new String[2][2];

         animals[0][0] = "Cat";
         animals[0][1] = "Dog";
         animals[1][0] = "Fish";
         animals[1][1] = "Lizard";

         System.out.println("animals:");
         for(String[] row : animals){
           for(String name: row){
             System.out.print(name + " ");
           }
           System.out.println();
         }

/*
         System.out.println("numbers for loop: ");
         for(int i = 0; i<numbers.length; i++){
           for(int j = 0; j < numbers[i].length; j++){
             System.out.println(numbers[i][j] + " ");
           }
           System.out.println();
         }
*/
         int[] values = {1, 3, 5, 7};

       for (int value: values)
           System.out.print(value + " ");
       System.out.println();


       int[][] numbers = { {1, 3, 5}, {2, 4}, {9} };

       System.out.println("numbers[0][2]: " +  numbers[0][2]);


       // print all numbers (for each loop)

       System.out.println("numbers:");

       for (int[] row : numbers)
       {
           for (int value : row)
           {
               System.out.print(value + " ");
           }
           System.out.println();
       }

       // for loop

       System.out.println("numbers (for loop):");

       for (int i=0; i<numbers.length; i++)
       {
           for (int j=0; j < numbers[i].length; j++)
           {
               System.out.print(numbers[i][j] + " ");
           }
           System.out.println();
       }
     }

}
