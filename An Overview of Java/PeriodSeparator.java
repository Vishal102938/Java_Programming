class Person {
    String name;
    int age;
    
    void greet(){
        System.out.println("Hello, My name is "+ name);
    }
} 
public class PeriodSeparator {
    public static void main(String args[]){
        Person p = new Person();// reference variable 'p' point to a Person object.

        
        p.name = "Sonu"; // using dot operator to assign the value to name field
        p.age = 21; // using dot operator to assign the value to age field.

        p.greet();
    }
    
}
