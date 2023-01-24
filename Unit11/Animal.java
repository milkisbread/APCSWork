public class Animal{

  public Animal(String name, int legCount, boolean furriness){
    this.name = name;
    this.legCount = legCount;
    this.furriness = furriness;
  }

  public String getName(){
    return name;
  }

  public int getLegCount(){
    return legCount;
  }

  public String name;
  public int legCount;
  public boolean furriness;
}
