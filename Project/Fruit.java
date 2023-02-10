import processing.core.*;

public class Fruit{

  public Fruits(int x, int y, int vy){
    this.x = x;
    this.y = y;
    this.vy = vy;
    this.color = color;

    Fruit(){
        x = int(random(width));
        y = int(random(height));
        vy = int(random(random(5,8)));
        c = color(0);
    }
  }

  public void display(){
    fill(c);
  }

  public void update(){
    y += vy;
  }

  public void checkEdges(){
    if(y > height || y < 0){
      y = height();
      x = int(random(width));
    }
  }

  private int x;
  private int y;
  private int vy;
  private color c;
}
