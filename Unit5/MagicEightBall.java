public class MagicEightBall{

  public String ask(String str){
    if(Math.random() <= .2){
      return "Yes";
    }else if(Math.random() > .2 && Math.random() <= .4){
      return "No";
    }else if(Math.random() > .4 && Math.random() <= .6){
      return "Maybe";
    }else if(Math.random() > .6 && Math.random() <= .8){
      return "Later";
    }else{
      return "I don't know";
    }
  }
}
