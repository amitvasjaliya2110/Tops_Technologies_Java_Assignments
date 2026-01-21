package core.java.exception;

import java.util.Scanner;

public class CustomExceptionDemo {
    public static void checkAge(int age) throws InvalidAgeException {
        if(age < 18){
            throw new InvalidAgeException("Age is not valid for voting!");
        }else{
            System.out.println("Age is valid for voting!");
        }
    }
    public static void main ( String[] args ) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your age: ");
            int age = sc.nextInt();
            checkAge(age);
        }catch(InvalidAgeException e){
            System.out.println("Custom Exception caught: "+e.getMessage());
        }
    }
}
