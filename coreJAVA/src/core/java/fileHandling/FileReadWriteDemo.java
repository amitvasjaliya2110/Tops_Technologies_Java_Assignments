package core.java.fileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteDemo {
    public static void main(String[] args) {

        try {
            // Write to file
            FileWriter fw = new FileWriter("demo.txt");
            fw.write("welcome to java Programming!");
            fw.write("\nJava is a most popular programming language.");
            fw.close();

            // Read from file
            FileReader fr = new FileReader("demo.txt");
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            fr.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
