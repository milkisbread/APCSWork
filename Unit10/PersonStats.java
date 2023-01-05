import java.util.*;

public class PersonStats{

  public static void PersonStatsTest(ArrayList<Person> people, int expected){
    float result = AveragePets(people);
    System.out.println("list: ");
    for(Person p: people){
      System.out.println(p.getName() + " number of pets:" + p.getPets());
    }

    System.out.println("expected: " + expected + " result: " + result);
    if(expected == result){
      System.out.println("Yay!");
    }else{
      System.out.println("nope");
    }
  }

  public static int AveragePets(ArrayList<Person> people){
    int total = 0;
    for (Person p: people){
      total += p.getPets();
    }
    return total/people.size();
  }

  public static String mostPets(ArrayList<Person> people){
    for(Person p: people){
      int result = 0;
      for(int i = 0; i < people.size(); i++){
          result = Math.max(p.getPets(), p.getPets());
        }
      if(p.getPets() >= result){
        return p.getName();
      }
    }
  }

  public static void main(String args[]){
    ArrayList<Person> people = new ArrayList<Person>();

    people.add(new Person("May", 1));
    people.add(new Person("June", 3));
    people.add(new Person("July", 5));

    PersonStatsTest(people, 3);

    System.out.println("average number of pets: " + AveragePets(people));
    System.out.println("person with the most pets" + mostPets(people));
  }

}
