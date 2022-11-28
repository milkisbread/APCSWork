public class TestScoreKeeper{

  public static void main(String[] args){

    ScoreKeeper score = new ScoreKeeper();

    score.addscoreNormal(4);
    score.addscoreBonus(2);

    System.out.println("total score: " + score.total());

  }

}
