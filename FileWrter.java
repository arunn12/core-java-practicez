package filewrter;

import java.io.FileWriter;

public class FileWrter {

    public static void main(String args[]) {
        try {
            FileWriter fw = new FileWriter("G:\\java.txt");
            fw.write("Welcome to JavaWorld.");
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Success...");
    }
}
