import processing.core.*;
import java.util.*;

public class FruitNinja extends PApplet{

  PImage wood;
  public void settings(){
    fullScreen();
  }

  public void setup(){
    scenes = new ArrayList<Scene>();
    scenes.add(new StartScene(this));
    scenes.add(new GameScene(this));
    scenes.add(new EndScene(this));
    /*fruits = new ArrayList<Fruit>();
    createFruit();*/
  }

  /*public void createFruit(){
    PVector position = new PVector(width/2, height/2);

    PVector velocity = PVector.random2D();
    velocity.setMag(random(3, 5));

    float radius = random(5, 20);
    int c = color(random(256), random(256), random(256));

    Fruit fruit = new Fruit(this, position, velocity, radius, c);
    fruits.add(fruit);
  }*/

  public void draw(){
    scenes.get(current).display();

    /*background(0);
    for(Fruit fruit : fruits){
      fruit.display();
    }*/
    
  }

  public void keyPressed(){
    if(keyCode == ENTER){
      current ++;
      if(current >= scenes.size()){
        current = 0;
      }
    }
    scenes.get(current).handleKeyPressed();
  }

  //private ArrayList<Fruit> fruits;
  private ArrayList<Scene> scenes;
  private int current = 0;

  public static void main(String[] args){
    PApplet.main("FruitNinja");
  }

}
