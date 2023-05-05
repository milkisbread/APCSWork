import processing.core.*;

public class GameScene implements Scene{
  PImage wood;
  PFont letters;
  public GameScene(PApplet p){
    this.p = p;
    this.position = new PVector(p.random(200,500), p.random(50, 100));
    this.velocity = new PVector(0, 5f);
    this.gravity = new PVector(0, 0.3f);
    this.type = (int) p.random(0,3);
    this.fruit = new Fruit(p, position, velocity, gravity, 50, 255, type);
    //this.type = (int) p.random(0,4);
    wood = p.loadImage("FruitNinjaBackground.png");
    letters = p.createFont("go3v2.ttf", 50);
  }

  public void display(){
    wood.resize(1440,900);
    p.image(wood,0,0);
    p.textFont(letters);
    p.textSize(500);
    fruit.display();
    p.fill(255);
    //p.text("FRUIT NINJA", p.width/2, p.height/2);
  }
/*    for(Fruit fruits : fruit){
      if(p.dist(fruits.x,fruits.y,p.mouseX,p.mouseY) < 15){
        //if mouse hits the image, change to image of fruit being cut
        current ++;
        scenes.get(current).handleKeyPressed();
      }
    }
  }
*/

  public void handleKeyPressed(){

  }


  private PApplet p;
  private PVector position;
  private PVector velocity;
  private PVector gravity;
  private Fruit fruit;
  private int type;
  //private ArrayList<Scene> scenes;
  //private int current = 0;
}
