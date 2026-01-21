package core.java.interfaceAndAbstractClass;

abstract class Bike{
    abstract void start();

    void fuelType() {        // Concrete method
        System.out.println("Bikes uses fuel");
    }
}

class KTM extends Bike{
    void start() {
        System.out.println("KTM start with self start");
    }
}
public class AbstractClassEx {
    public static void main ( String[] args ) {
        Bike b1 = new KTM();
        b1.start ();
        b1.fuelType();
    }
}
