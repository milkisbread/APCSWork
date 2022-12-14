import processing.core.*;
import java.util.*;

public class Ball{
  public Ball(PApplet p, PVector position, PVector velocity,
              PVector wind, PVector gravity, float radius, int color){
    this.p = p;
    this.position = position;
    this.velocity = velocity;
    this.wind = wind;
    this.gravity = gravity;
    this.radius = radius;
    this.color = color;
  }

  public void display(){
    p.fill(color);
    p.ellipse(position.x, position.y, radius, radius);

    position.add(velocity);
    velocity.add(wind);
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
    private PVector wind;
    private PVector gravity;
    private float radius;
    private int color;

}
