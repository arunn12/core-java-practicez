package filedinput;

import java.io.*;

public class FileDinput {

    public static void main(String[] args) throws IOException {
        FileInputStream input = new FileInputStream("G:\\java.txt");
        DataInputStream inst = new DataInputStream(input);
        int count = input.available();
        byte[] ary = new byte[count];
        inst.read(ary);
        for (byte bt : ary) {
            char k = (char) bt;
            System.out.print(k + "-");
        }
    }
}
