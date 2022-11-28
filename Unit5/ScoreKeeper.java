public class ScoreKeeper{

  public ScoreKeeper(){
    score = 0;
  }
  public void addscoreNormal(int n){
    score += n*100;
  }
  public void addscoreBonus(int b){
    score += b*1000;
  }
  public int total(){
    return score;
  }

  private int score;

}
