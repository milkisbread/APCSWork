import processing.core.*;
import java.util.*;

public class Bounce extends PApplet{
    public void settings(){
        size(800, 800);
    }

    public void setup(){
      gravity = new PVector(0, 0.1f);
      wind = new PVector(0,0);
      balls = new ArrayList<Ball> ();

      createBall();
    }

    private void createBall()
    {
        PVector position = new PVector(150, 150);
        PVector velocity = new PVector(0, 0);
        float radius = random(255);
        int c = color(255, 0, 0);

        Ball b = new Ball(this, position, velocity, wind, gravity, radius, c);
        balls.add(b);
    }


    public void draw(){
        background(0);
        for (Ball ball : balls)
            ball.display();

        text("wind: " + wind.x, 50, 50);
    }

    public void keyPressed(){
        if(keyCode == RIGHT){
          wind.x = 0.1f;
        }else if(keyCode == LEFT){
          wind.x = -0.1f;
        }
    }

    public void keyReleased(){
      if(keyCode == RIGHT || keyCode == LEFT){
        wind = new PVector(0,0);
      }
    }

    public static void main(String[] args){
        PApplet.main("Bounce");
    }

    private PVector gravity;
    private PVector wind;
    private ArrayList<Ball> balls;

}
