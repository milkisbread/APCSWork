import processing.core.*;
import java.util.*;

public class Bounce extends PApplet{
    public void settings(){
        size(800, 800);
    }

    public void setup(){
      
    }

    public void draw(){
        background(0);
        for (Ball ball : balls)
            ball.display();
    }

    public void keyPressed(){
        if(keyCode == RIGHT){
          PVector wind = new PVector(0.05, 0);
        }else if(keyCode == LEFT){
          PVector wind = new PVector(-0.05, 0);
        }
    }

    public static void main(String[] args){
        PApplet.main("Bounce");
    }

    private ArrayList<Ball> balls;
}
