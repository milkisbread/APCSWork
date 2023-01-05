import java.util.*;

public class ItemCalculator{

  public static void testItemCalculator(ArrayList<Item> things, double expected){
    float result = averagePrice(things);
    System.out.println("list: ");
    for(Item t: things){
      System.out.println(t.getName() + " $" + t.getPrice());
    }

    System.out.println("expected: " + expected + " result: " + result);
    if(expected == result){
      System.out.println("Yay!");
    }else{
      System.out.println("nope");
    }
  }


  public static float averagePrice(ArrayList<Item> things){
    float total = 0;
    for (Item t: things){
      total += t.getPrice();
    }
    return total/things.size();
  }

  public static void main(String args[]){
    ArrayList<Item> things = new ArrayList<Item>();

    things.add(new Item("apples", 3));
    things.add(new Item("bananas", 4));

    testItemCalculator(things, 3.5);

    System.out.println("average price of items: " + averagePrice(things));
  }

}
