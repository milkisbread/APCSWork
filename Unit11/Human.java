public class Human extends Animal{

  public Human(String name, int legCount, boolean furriness){
    super(name, legCount, furriness);
  }

  public String list(){
    return ("Hi, I'm a " + name + " and I have " + legCount + " legs. " + "Furry?: " + furriness);
  }

}
