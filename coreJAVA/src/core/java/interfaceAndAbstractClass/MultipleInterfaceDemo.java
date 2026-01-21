package core.java.interfaceAndAbstractClass;

interface printable {
    void print();
}

interface scannable {
    void scan();
}

class Printer implements printable,scannable {
    public void print() {
        System.out.println("printing documents!");
    }

    public void scan() {
        System.out.println("scanning documents!");
    }
}
public class MultipleInterfaceDemo {
    public static void main ( String[] args ) {
        Printer printer = new Printer();
        printer.print();
        printer.scan();
    }
}
