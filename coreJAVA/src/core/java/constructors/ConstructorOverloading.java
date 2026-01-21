package core.java.constructors;

class Student{
    String name;
    int age;

    Student(){
        name = "unknown";
        age = 0;
    }

    Student(String name){
        this.name = name;
        this.age = 20;
    }

    Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
        System.out.println("-------------------");
    }
}
public class ConstructorOverloading {
    public static void main ( String[] args ) {
        Student s1 = new Student();
        Student s2 = new Student("Amit");
        Student s3 = new Student("Rahul",25);

        s1.displayDetails();
        s2.displayDetails();
    }
}
