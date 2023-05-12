import java.util.*;

public class AcademicClass{
  private ArrayList<Student> students;
  private int theNum;
  private Teacher teach;

  public AcademicClass(){
    students = new ArrayList<Student>();
  }

  public void addKids(String name, int favNum){
    Student student = new Student(name, favNum);
    students.add(student);
  }

  public void AllStudents(){
    for(Student s: students){
      System.out.println(s.getName());
    }
  }

  //a function that takes a single integer n as input and returns an
  //ArrayList of the names of the students whose favorite number is n

  public void setTeacher(String TeachName, String subject){
    teach = new Teacher(TeachName, subject);
  }

  public ArrayList<Student> numClass(int num){
    ArrayList<Student> result = new ArrayList<Student>();

    for(Student s: students){
      if(s.getFavNum() == num){
        result.add(s);
      }
    }
    return result;
  }

  //a function that returns an ArrayList of the names of the students
  //whose favorite number is odd

  public ArrayList<Student> oddNum(){
    ArrayList<Student> outcome = new ArrayList<Student>();

    for(Student s: students){
      if(s.getFavNum() % 2 == 1){
        outcome.add(s);
      }
    }
    return outcome;
  }

  public static void main(String[] args){
    AcademicClass TheClass = new AcademicClass();

    TheClass.addKids("Kate", 5);
    TheClass.addKids("Chloe", 17);
    TheClass.addKids("Allie", 8);
    TheClass.addKids("Kalliou", 5);

    TheClass.AllStudents();

    TheClass.setTeacher("Ms. Mary", "math");
    System.out.println("The teacher's name is " + TheClass.teach.getTeachName() + " and they teach " + TheClass.teach.getSubject() + ".");

    System.out.println("Students with the same favorite number: ");
    ArrayList<Student> result = TheClass.numClass(5);
    for(Student s: result){
      System.out.println(s.getName());
    }

    System.out.println("Students with an odd favorite number: ");
    ArrayList<Student> outcome = TheClass.oddNum();
    for(Student s: outcome){
      System.out.println(s.getName());
    }
  }
}
