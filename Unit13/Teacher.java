public class Teacher{

  private String TeachName;
  private String subject;

  public Teacher(String TeachName, String subject){
    this.TeachName = TeachName;
    this.subject = subject;
  }

  public String getTeachName(){
    return TeachName;
  }

  public String getSubject(){
    return subject;
  }

}
