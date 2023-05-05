import processing.core.*;
import java.util.*;
import java.util.Random;

public class Fruit{

  PImage watermelon;
  PImage pineapple;
  PImage mango;
  PImage bomb;

  public Fruit(PApplet p, PVector position, PVector velocity, PVector gravity, int radius, int color, int type){
      this.p = p;
      this.position = position;
      //this.positiony = (int) p.random(p.height);
      this.velocity = velocity;
      this.gravity = gravity;
      this.radius = radius;
      this.color = color;
      this.type = type;
      watermelon = p.loadImage("FNWatermelon.png");
      pineapple = p.loadImage("FNPineapple.png");
      mango = p.loadImage("FNMango.png");
      bomb = p.loadImage("FNBomb.png");
    }

    public void display(){
      //watermelon.resize(350,200);

      position.add(velocity);
      velocity.add(gravity);
      while(scenes.get(current) == GameScene()){
        if(type == 0){
          p.image(watermelon, position.x, position.y);
        }else if(type == 1){
          p.image(pineapple, position.x, position.y);
        }else if(type == 2){
          p.image(mango,  position.x, position.y);
        }else if(type == 3){
          p.image(bomb,  position.x, position.y);
        }
      }

      if(position.x<radius || position.x>p.width-radius){
        velocity.x *= -1;
      }
      if(position.y<radius || position.y>(p.height+(radius*45))){
        velocity.y *= -1;
      }

    }

    private PApplet p;
    private PVector position;
    private PVector velocity;
    private PVector gravity;
    private float radius;
    private int color;
    private int type;
    private ArrayList<Scene> scenes;
    private int current = 0;
}
/*
import processing.core.*;
import java.util.*;

public class Fruit extends PApplet{
  public Fruit(PApplet p, PVector position, PVector velocity,
                  PVector gravity, float radius, int color){
    this.p = p;
    this.position = position;
    this.velocity = velocity;
    this.gravity = gravity;
    this.radius = radius;
    this.color = color;
  }

  public void display(){
    p.fill(color);
    p.ellipse(position.x, position.y, radius, radius);

    position.add(velocity);
    velocity.add(gravity);

    if(position.x > (p.width + radius) || position.x < radius){
      velocity.x *= -1;
    }else if(position.y > (p.height + radius) || position.y < radius){
      velocity.y *= -1;
    }

    if(position.y > p.height + radius){
      position.y = p.height + radius;
    }
  }
    private PApplet p;
    private PVector position;
    private PVector velocity;
    private PVector gravity;
    private float radius;
    private int color;

}
*/
