package practic.file_writing_reading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileInputStream f = null;
        try {
            f = new FileInputStream("/home/vlas/programming/java_studing/hello");
            byte[] bytes = f.readAllBytes();
            String s = new String(bytes);
            System.out.println(s);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
