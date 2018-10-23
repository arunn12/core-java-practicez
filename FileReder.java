package filereder;

import java.io.FileReader;

public class FileReder {

    public static void main(String args[]) throws Exception {
        try (FileReader fr = new FileReader("G:\\java.txt")) {
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        }
    }
}
