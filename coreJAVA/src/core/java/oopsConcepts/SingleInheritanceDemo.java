package core.java.oopsConcepts;

class Vehicle{
    void drive(){
        System.out.println("Driving Vehicle");
    }
}

class Car extends Vehicle{
    void driveCar(){
        System.out.println("Driving Car");
    }
}
public class SingleInheritanceDemo {
    public static void main ( String[] args ) {
        Car car = new Car();
        car.drive ();
        car.driveCar();
    }
}
