package core.java.interfaceAndAbstractClass;

interface PaymentGateway {
    void pay(double amount);
}

class CreditCardPayment implements PaymentGateway {
    public void pay(double amount) {
        System.out.println("Paid "+amount+" using Credit Card");
    }
}

class BankAccountPayment implements PaymentGateway {
    public void pay(double amount) {
        System.out.println("Paid "+amount+" using Bank Account");
    }
}

class UpiPayment implements PaymentGateway {
    public void pay(double amount) {
        System.out.println("Paid "+amount+" using UPI");
    }
}

public class PaymentGatewayEx {
    public static void main ( String[] args ) {
        PaymentGateway payment;

        payment = new CreditCardPayment();
        payment.pay(40000);

        payment = new BankAccountPayment();
        payment.pay(10000);

        payment = new UpiPayment();
        payment.pay(60000);
    }
}
