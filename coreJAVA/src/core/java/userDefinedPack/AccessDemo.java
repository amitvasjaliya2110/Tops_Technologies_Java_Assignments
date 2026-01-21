package core.java.userDefinedPack;

public class AccessDemo {
    public int value = 555;
    protected int protectedValue = 45;
    int defaultValue = 50;
    private int privateValue = 30;

    public void show(){
        System.out.println("Public Value : "+value);
        System.out.println("Protected Value : "+protectedValue);
        System.out.println("Default Value : "+defaultValue);
        System.out.println("Private Value : "+privateValue);
    }
}
