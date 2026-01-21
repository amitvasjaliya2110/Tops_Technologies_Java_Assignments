package core.java.oopsConcepts;

class Electronics{
    void show(){
        System.out.println("This is an Electronics");
    }
}

class Microwave extends Electronics{
    void microItem(){
        System.out.println("Microwave is a electronic item!");
    }
}

class Fridge extends Microwave{
    void coolItem(){
        System.out.println("Fridge is used for colling fruits and vegetable!");
    }
}
public class MultilevelInheritanceDemo {
    public static void main ( String[] args ) {
        Fridge f = new Fridge();
        f.show();
        f.microItem();
        f.coolItem();
    }
}
