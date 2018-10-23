package filebufreder;

import java.io.*;

public class FileBufReder {

    public static void main(String args[]) throws Exception {
        FileReader fr = new FileReader("G:\\java.txt");
        BufferedReader br = new BufferedReader(fr);
        int i;
        while ((i = br.read()) != -1) {
            System.out.print((char) i);
        }
        br.close();
        fr.close();
    }
}
