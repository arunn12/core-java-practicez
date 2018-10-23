package filebufwriter;

import java.io.BufferedWriter;
import java.io.*;

public class FileBufwriter {

    public static void main(String[] args) throws Exception {
        FileWriter writer = new FileWriter("G:\\java.txt");
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write("Welcome to java.");
        buffer.close();
        System.out.println("Success");
    }
}
