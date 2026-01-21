package core.java.arraysAndStrings;

public class StringMethodsDemo {
    public static void main ( String[] args ) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = "Programming";

        //using equals()
        System.out.println("s1 equals s2: "+s1.equals(s2));
        System.out.println("s1 equals s3: "+s1.equals(s3));

        //using compareTo()
        System.out.println("s1 compareTo s2: "+s1.compareTo (s2));
        System.out.println("s1 compareTo s3: "+s1.compareTo (s3));
    }
}
