import processing.core.*;

public class StartScene implements Scene{
  public StartScene(PApplet p){
    this.p = p;
  }

  public void display(){
    p.background(144, 76, 31);
    p.textAlign(PApplet.CENTER);
    p.textSize(50);
    p.fill(255);
    //p.textFont(PApplet."Yeon Sung");
    p.text("FRUIT NINJA", p.width/2, p.height/2);
  }

  public void handleKeyPressed(){

  }

  private PApplet p;

}
