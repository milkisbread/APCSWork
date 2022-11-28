public class TestRectangle{

  public static void testAll(Rectangle r, double expectedArea, double expectedPerimeter, double expectedDiagonal){
    double resultA = r.Area();
    double resultP = r.Perimeter();
    double resultD = r.Diagonal();
    System.out.println("area: " + r.Area() + " expected: " + expectedArea +
     " result: " + resultA);
    System.out.println("perimeter: " + r.Perimeter() + " expected: " + expectedPerimeter +
    " result: " + resultP);
    System.out.println("diagonal: " + r.Diagonal() + " expected: " + expectedDiagonal +
    " result: " + resultD);

    if (Math.abs(resultA - expectedArea) < .001){
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED");
    }
    if (Math.abs(resultP - expectedPerimeter) < .001){
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED");
    }
    if (Math.abs(resultD - expectedDiagonal) < .001){
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED");
    }
  }


  public static void main(String[] args){
    Rectangle r1 = new Rectangle(6, 8);
    Rectangle r2 = new Rectangle(3, 4);

    //unit tests
    testAll(r1, 48, 28, 10);
    testAll(r2, 12, 14, 5);
  }

}
