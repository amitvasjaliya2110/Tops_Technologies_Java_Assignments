package core.java.constructors;

class Atm{
    int pin;
    String customerName;

    Atm(int pin, String customerName){
        this.pin = pin;
        this.customerName = customerName;
    }

    void display(){
        System.out.println("Pin is: " + this.pin);
        System.out.println("Customer Name is: " + this.customerName);
    }
}
public class ParameterConstructorDemo {
    public static void main ( String[] args ) {
        Atm a1 = new Atm(4444,"Ajay Bhatia");
        a1.display();
    }
}
