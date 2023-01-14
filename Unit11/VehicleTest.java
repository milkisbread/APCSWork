import java.util.*;

public class VehicleTest{

  public static void main(String[] args){
    ArrayList<Vehicle> motor = new ArrayList<Vehicle>();

    Car c = new Car();
    motor.add(c);

    Motorcycle m = new Motorcycle();
    motor.add(m);

    Bicycle b = new Bicycle();
    motor.add(b);

    Unicycle u = new Unicycle();
    motor.add(u);

    for(Vehicle v: motor){
      System.out.println("VEHICLE: " + v.name() + " WHEELS: " + v.wheelCount() + " HUMAN POWERED?: " + v.isHumanPowered());
    }

  }

}
