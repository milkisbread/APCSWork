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

         int c = 5;
         int[][] numbers = new int[c][c];
         System.out.println("Array of Doubles:");
         for (int i=0; i<c; i++){
             for (int j=0; j < c; j++){
              numbers[i][j] = ((i+1)*10) + j+1;
              System.out.print(numbers[i][j]);
             }
             System.out.println();
         }

       int b = 6;
       int h = 5;
       int[][] cell = new int[b][h];
       System.out.println("Array of Integers:");
       for (int i=0; i < b; i++){
           for (int j=0; j < h; j++){
               cell[i][j] = i+1;
               System.out.print(cell[i][j]);
              }
          System.out.println();
       }
     }

}
