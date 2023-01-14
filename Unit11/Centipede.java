public class Centipede extends Animal{

  public Centipede(String name, int legCount, boolean furriness){
    super(name, legCount, furriness);
  }

  public String list(){
    return ("Crackle, I'm a " + name + " and I have " + legCount + " legs. " + "Furry?: " + furriness);
  }

}
