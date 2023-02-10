import processing.core.*;
import java.util.*;

public class FruitNinja extends PApplet{
  public void setup(){
    size(600,600);
    gameState = "START";

    textAlign(CENTER);

    fruits = new ArrayList<Fruits>();
    for(int i = 0; i < 5; i++){
      Fruits f;
      f = new Fruit();
      fruits.add(f);
    }
  }

  public void draw(){
    textFont(title);

    if(gameState == "START"){
      drawStart();
    }else if(gameState == "GAME"){
      drawGame();
    }else{
      drawEnd();
    }
  }

  public void keyPressed(){
    if(gameState == "START"){
      gameState = "GAME";
    }else if(gameState == "END"){
      gameState = "START";
    }
  }

  public void drawStart(){
    text("FRUIT NINJA", width, height);
    text("PRESS SPACE TO START GAME", width, height+40);
  }

  public void drawGame(){
    for(Fruit f: fruits){
      f.update();
      f.checkEdges();
      f.display();
    }
  }

  public void drawEnd(){
    text("GAME OVER", width, height);
    text("PRESS SPACE TO START AGAIN", width, height+40);
  }
  public String gameState;
  private ArrayList<Fruit> fruits;

}
