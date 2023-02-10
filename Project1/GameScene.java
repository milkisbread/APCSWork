import processing.core.*;

public class GameScene implements Scene{
  public GameScene(PApplet p){
    this.p = p;
    this.position = new PVector(400, 400);
    this.velocity = new PVector(0, 5f);
    this.gravity = new PVector(0, 0.3f);
    this.fruit = new Fruit(p, position, velocity, gravity, 50, 255);
  }

  public void display(){
    p.background(144, 76, 31);
    fruit.display();
    p.fill(255);
  }

  public void handleKeyPressed(){

  }

  private PApplet p;
  private PVector position;
  private PVector velocity;
  private PVector gravity;
  private Fruit fruit;
}
