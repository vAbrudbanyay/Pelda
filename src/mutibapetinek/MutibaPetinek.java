package mutibapetinek;

public class MutibaPetinek {

  public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student();
    Employee e1 = new Employee();
    Employee e2 = new Employee();
    Employee e3 = new Employee("Mimi", "Physics", 44);
    
    s1.setName("Géza");
    s2.setName("Béla");
    s1.setMajor("English");
    s2.setMajor("Hungarian");
    s1.setRegNr(0);
    
    e1.setName("Gizi");
    e2.setName("Tóni");
    e1.setProfession("English");
    e2.setProfession("History");
    e1.setAge(45);
    e2.setAge(36);
    
    
    s1.showInfo(s1);
    s2.showInfo(s2);
    
    e1.showInfo(e1);
    e2.showInfo(e2);
    
    e3.showInfo(e3);
    
    e1.language();
    s1.language();
    
  }
  
}
