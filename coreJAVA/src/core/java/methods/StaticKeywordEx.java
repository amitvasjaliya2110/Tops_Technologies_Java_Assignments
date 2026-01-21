package core.java.methods;

public class StaticKeywordEx {
    static int count = 0;

    static void showCount(){
        count++;
        System.out.println("Count Value:"+count);
    }
    public static void main ( String[] args ) {
        StaticKeywordEx.showCount();
        StaticKeywordEx.showCount();
        StaticKeywordEx.showCount();
    }
}
