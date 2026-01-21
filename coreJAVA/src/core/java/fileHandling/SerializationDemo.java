package core.java.fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main ( String[] args ) {
        try {

            //serialization
            Student s1 = new Student(101,"Aman");

            FileOutputStream fos = new FileOutputStream("student.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.close();

            //deserialization

            FileInputStream fis = new FileInputStream("student.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student s2 = (Student) ois.readObject ();
            ois.close();

            System.out.println("Student Id: "+s2.id);
            System.out.println("Student Name: "+s2.name);

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
