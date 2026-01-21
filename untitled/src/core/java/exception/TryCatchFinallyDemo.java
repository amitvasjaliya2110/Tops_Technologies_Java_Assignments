package core.java.exception;

public class TryCatchFinallyDemo {
    public static void main ( String[] args ) {
        try{
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result: "+result);
        }catch(Exception e){
            System.out.println("Exception: "+e);
        }finally{
            System.out.println("finally block");
        }
    }
}
