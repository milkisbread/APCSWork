public class Sponge extends Animal{

  public Sponge(String name, int legCount, boolean furriness){
    super(name, legCount, furriness);
  }

  public String list(){
    return ("Bubble bubble, I'm a " + name + " and I have " + legCount + " legs. " + "Furry?: " + furriness);
  }

}
