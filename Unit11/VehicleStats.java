import java.util.*;

public class VehicleStats{

  public static int TotalWheels(ArrayList<Vehicle> vehicles){
    int result = 0;

    for(Vehicle v: vehicles){
      result += v.wheelCount();
    }
    return result;

  }

  public static ArrayList<Vehicle> powerHuman(ArrayList<Vehicle> vehicles){
    ArrayList<Vehicle> result = new ArrayList<Vehicle>();
    for(Vehicle v: vehicles){
        if (v.isHumanPowered() == true){
          result.add(v);
        }
    }
    return result;
  }

  public static void main(String[] args){
    ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

    Car c = new Car();
    vehicles.add(c);

    Motorcycle m = new Motorcycle();
    vehicles.add(m);

    Bicycle b = new Bicycle();
    vehicles.add(b);

    Unicycle u = new Unicycle();
    vehicles.add(u);

    System.out.println("total wheels: " + TotalWheels(vehicles));
    System.out.println("only human powered vehicles: ");

    ArrayList<Vehicle> result = powerHuman(vehicles);
    for (Vehicle v: result){
      System.out.println(v.name());
    }
  }

}
