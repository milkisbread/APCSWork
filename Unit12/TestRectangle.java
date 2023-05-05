public class TestRectangle{

  public static double AveragePerimeter(Rectangle[][] rect){
    double average = 0.0;
    for(int i = 0; i < rect.length; i++){
      for(int j = 0; j < rect[i].length; j++){
        average+=(2*rect[i][j].getWidth())+(2*rect[i][j].getHeight());
      }
    }
    return average/(rect.length);
  }

  public static double GreatestArea(Rectangle[][] rect){
    double area = 0.0;
    for(int i = 0; i < rect.length; i++){
      for(int j = 0; j < rect[i].length; j++){
        if(rect[i][j].getWidth()*rect[i][j].getHeight() > area){
          area = (rect[i][j].getWidth())*(rect[i][j].getHeight());
        }
      }
    }
    return area;
  }

  public static void main(String[] args){
    Rectangle[][] rect = new Rectangle[1][4];
    rect[0][0] = new Rectangle("rect1", 2, 3);
    rect[0][1] = new Rectangle("rect2", 4, 5);
    rect[0][2] = new Rectangle("rect3", 5, 6);
    rect[0][3] = new Rectangle("rect4", 6, 7);

    System.out.println("The average perimeter is " + AveragePerimeter(rect));
    System.out.println("The greatest area is " + GreatestArea(rect));
  }
}
