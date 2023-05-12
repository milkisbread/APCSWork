import java.util.*;

public class ShapeCollection{

  private ArrayList<Shape> shapes;

  public ShapeCollection(){
    shapes = new ArrayList<Shape>();
  }

  public void expand(String name, int sides){
    Shape shape = new Shape(name, sides);
    shapes.add(shape);
  }

  public void listShapes(){
    for(Shape s: shapes){
      System.out.println(s.getName() + ": " + s.getSides() + " sides");
    }
  }

  public int numberOfSides(String shapeName){
    int numSides = 0;
    for(Shape s: shapes){
      if(shapeName.equals(s.getName())){
        numSides = s.getSides();
      }
    }
    return numSides;
  }

  public double avgNumSides(){
    double average = 0;

    for(Shape s: shapes){
      average += s.getSides();
    }

    return average / shapes.size();
  }

  public ArrayList<Shape> getEvenShapes(){
    ArrayList<Shape> result = new ArrayList<Shape>();

    for(Shape s: shapes){
      if(s.getSides() % 2 == 0){
        result.add(s);
      }
    }
    return result;
  }

  public static void main(String[] args){
    ShapeCollection collection = new ShapeCollection();

    collection.expand("Triangle", 3);
    collection.expand("Square", 4);
    collection.expand("Pentagon", 5);
    collection.expand("Hexagon", 6);
    collection.expand("Octogon", 8);

    collection.listShapes();

    System.out.println("Number of Sides for a square is " + collection.numberOfSides("Square") + " sides.");
    System.out.println("Average number of sides: " + collection.avgNumSides());
    System.out.println("Shapes with even number of sides: ");

    ArrayList<Shape> result = collection.getEvenShapes();
    for(Shape s: result){
      System.out.println(s.getName());
    }
  }
}
