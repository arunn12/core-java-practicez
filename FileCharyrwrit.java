package filecharyrwrit;

import java.io.CharArrayWriter;
import java.io.FileWriter;

public class FileCharyrwrit {

    public static void main(String args[]) throws Exception {
        CharArrayWriter out = new CharArrayWriter();
        out.write("Welcome to java hello world");
        FileWriter f1 = new FileWriter("G:\\java.txt");
        out.writeTo(f1);
        f1.close();
        System.out.println("Success...");
    }
}
