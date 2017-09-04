package mutibapetinek;

public class Student extends People{
  private String name;
  private String major;
  private static int regNr;

  public Student(){
  
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getMajor() {
    return major;
  }

  public void setMajor(String major) {
    this.major = major;
  }

  public static int getRegNr() {
    return regNr;
  }

  public static void setRegNr(int regNr) {
    Student.regNr = regNr+1;
  }

  
  public void showInfo(Student s){
    System.out.println("Student name:  " + s.name + ", age: " + s.regNr + ", major: " + s.major);
  }
  
  public void language () {
   }
}
