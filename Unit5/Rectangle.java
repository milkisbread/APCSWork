public class Rectangle{

  public Rectangle(int baseIn, int heightIn){
    base = baseIn;
    height = heightIn;
  }

  public double Area(){
    return base*height;
  }
  public double Perimeter(){
    return 2*base + 2*height;
  }
  public double Diagonal(){
    return Math.sqrt(base*base + height*height);
  }

  private double base;
  private double height;
}
