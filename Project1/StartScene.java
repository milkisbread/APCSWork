import processing.core.*;

public class StartScene implements Scene{
  PImage wood;
  PFont letters;
  public StartScene(PApplet p){
    this.p = p;
    wood = p.loadImage("FruitNinjaBackground.png");
    letters = p.createFont("go3v2.ttf", 50);
  }

  public void display(){
    wood.resize(1440,900);
    p.image(wood,0,0);
    p.textAlign(PApplet.CENTER);
    p.fill(255);
    //p.textFont(PApplet."Yeon Sung");
    p.textFont(letters);
    p.textSize(100);
    p.text("FRUIT NINJA", p.width/2, p.height/2);
    p.textSize(75);
    p.textAlign(PApplet.CENTER);
    p.text("Press ENTER to start", (p.width/2), (p.height/2)+75);
  }

  public void handleKeyPressed(){

  }

  private PApplet p;

}
