import processing.core.*;

public class EndScene implements Scene{
  PImage wood;
  PFont letters;
  public EndScene(PApplet p){
    this.p = p;
    wood = p.loadImage("FruitNinjaBackground.png");
    letters = p.createFont("go3v2.ttf", 50);
  }

  public void display(){
    wood.resize(1440,900);
    p.image(wood,0,0);
    p.textAlign(PApplet.CENTER);
    p.textFont(letters);
    p.textSize(100);
    p.fill(255,0,0);
    p.text("GAME OVER", p.width/2, p.height/2);
    p.text("Press ENTER to play again", (p.width/2), (p.height/2)+75);
  }

  public void handleKeyPressed(){

  }

  private PApplet p;
}
