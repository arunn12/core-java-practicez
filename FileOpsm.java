package fileopsm;

import java.io.FileOutputStream;

public class FileOpsm {

    public static void main(String args[]) {
        try {
            FileOutputStream fout = new FileOutputStream("G:\\java.txt");
            String s = "Welcome to Java Program.";
            byte b[] = s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
