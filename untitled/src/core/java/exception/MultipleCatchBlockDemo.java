package core.java.exception;

import java.util.Arrays;

public class MultipleCatchBlockDemo {
    public static void main ( String[] args ) {
        try{
            int[] arr = {1,2,3};
            System.out.println(arr[5]);

            int a = 10 / 0;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds exception Occurred");
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception Occurred");
        }catch (Exception e){
            System.out.println("General Exception Occurred");
        }
    }
}
