package filedoutput;

import java.io.*;

public class FileDoutput {

    public static void main(String[] args) throws IOException {
        try {
            FileOutputStream file = new FileOutputStream("G:\\java.txt");
            DataOutputStream data = new DataOutputStream(file);
            data.writeInt(67);
            data.flush();
            data.close();
            System.out.println("Succcess...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
