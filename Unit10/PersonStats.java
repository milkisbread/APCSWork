import java.util.*;

public class PersonStats{

  public static void PersonStatsTest(ArrayList<Person> people, int expected){
    float result = AveragePets(people);
    System.out.println("list: ");
    for(Person p: people){
      System.out.println("Name: " + p.getName() + "; Number of pets:" + p.getPets());
    }

    System.out.println("expected average: " + expected + " average result: " + result);
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

/*
  public static int mostPets(ArrayList<Person> people){
    int result = 0;
    for(Person p: people){
      for(int i = 0; i < people.size(); i++){
          result = Math.max(p.getPets(), p.getPets());
      }
    }
    return result;
  }

  public static String mostName(ArrayList<Person> people){
    String pets = " ";
    for(Person p: people){
      if(p.getPets() >= mostPets(people)){
        pets = p.getName();
      }
    }
    return pets;
  }
  */

  public static String mostName(ArrayList<Person> people){
    Person pMax = people.get(0);
    for(Person p: people){
      if(p.getPets() > pMax.getPets()){
        pMax = p;
      }
    }
    return pMax.getName();
  }

  public static ArrayList<Person> atLeast(ArrayList<Person> people){
    ArrayList<Person> result = new ArrayList<Person>();
    for(Person p: people){
        if (p.getPets() >= 2){
          result.add(p);
        }
    }
    return result;
  }

  public static void main(String args[]){
    ArrayList<Person> people = new ArrayList<Person>();

    people.add(new Person("May", 1));
    people.add(new Person("June", 3));
    people.add(new Person("July", 5));

    PersonStatsTest(people, 3);

    System.out.println("average number of pets: " + AveragePets(people));
    //System.out.println("most pets: " + mostPets(people));
    System.out.println("person with the most number of pets: " + mostName(people));
    System.out.println("has at least 2 pets: ");

    ArrayList<Person> result = atLeast(people);
    for (Person p : result){
      System.out.println(p.getName());
    }
  }

}
