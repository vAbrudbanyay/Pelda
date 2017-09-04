package mutibapetinek;

public class Employee extends People{
  private String name;
  private String profession;
  private int age;
  
  
  public Employee() {
    
  }

  public Employee(String name) {
    this.name = name;
  }
  
  public Employee(String name, String profession) {
    this(name);
    this.profession= profession;
  }

  public Employee(String name, String profession, int age) {
    this(name, profession);
    this.age= age;
  }  

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getProfession() {
    return profession;
  }

  public void setProfession(String profession) {
    this.profession = profession;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
 
  public void showInfo(Employee e){
    System.out.println("Employee name:  " + e.name + ", age: " + e.age + ", profession: " + e.profession);
  }
  
  @Override
  public void language () {
    System.out.println("language of Employee class");
  }
  
}
