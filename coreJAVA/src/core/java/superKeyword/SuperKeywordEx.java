package core.java.superKeyword;

class Person{
    Person(){
        System.out.println("Person constructor called");
    }

    void display(){
        System.out.println("This is person class method");
    }
}

class Emp extends Person{
    Emp(){
        super();
        System.out.println("Emp constructor called");
    }

    void display(){
        super.display();
        System.out.println("This is emp class method");
    }
}
public class SuperKeywordEx {
    public static void main ( String[] args ) {
        Emp emp = new Emp();
        emp.display();
    }
}
