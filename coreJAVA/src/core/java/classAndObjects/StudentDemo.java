package core.java.classAndObjects;

public class StudentDemo {

    String name;
    int age;

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age : " + age);
    }

    public static void main ( String[] args ) {
       StudentDemo s1 = new StudentDemo();
       s1.name = "Amit";
       s1.age = 23;
       s1.displayDetails();
    }
}
