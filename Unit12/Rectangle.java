public class Rectangle{
  private String name;
  private double width;
  private double height;

  public Rectangle(String getName, double getWidth, double getHeight){
    name = getName;
    width = getWidth;
    height = getHeight;
  }

  public String getName(){
    return name;
  }
  public double getWidth(){
    return width;
  }
  public double getHeight(){
    return height;
  }

}
