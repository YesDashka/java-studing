import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fileInputStream = new FileInputStream("/home/vlas/programming/java_studing/hello");
        byte[] bytes = fileInputStream.readAllBytes();
        System.out.println(bytes);

        }

    }
