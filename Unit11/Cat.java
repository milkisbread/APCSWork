public class Cat extends Animal{

  public Cat(String name, int legCount, boolean furriness){
    super(name, legCount, furriness);
  }

  public String list(){
    return ("Meow, I'm a " + name + " and I have " + legCount + " legs. " + "Furry?:  " + furriness);
  }

}
