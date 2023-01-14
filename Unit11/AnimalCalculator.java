import java.util.*;

public class AnimalCalculator{

  public static int AverageLegs(ArrayList<Animal> animals){
    int result = 0;

    for(Animal a: animals){
      result += a.legCount();
    }
    return result/animal.size();

  }

  public static void main(String[] args){
    Human Hooman = new Human("Human", 2, false);
    System.out.println(Hooman.list());

    Cat Kat = new Cat("Cat", 4, true);
    System.out.println(Kat.list());

    Sponge Spunge = new Sponge("Sponge", 0, false);
    System.out.println(Spunge.list());

    Centipede Centeepeed = new Centipede("Centipede", 100, false);
    System.out.println(Centeepeed.list());

    System.out.println();

    ArrayList<Animal> animals = new ArrayList<Animal>();
      animals.add(Hooman);
      animals.add(Kat);
      animals.add(Spunge);
      animals.add(Centeepeed);

  }
}
