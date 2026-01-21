package core.java.oopsConcepts;

class Shape{
    void draw(){
        System.out.println("Drawing a Shape");
    }
}

class Circle extends Shape{
    void draw(){
        System.out.println("Drawing a Circle");
    }
}
public class MethodOverridingDemo {
    public static void main ( String[] args ) {
        Shape s1 = new Circle();
        s1.draw();
    }
}
