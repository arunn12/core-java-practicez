package filecharyred;

import java.io.CharArrayReader;

public class FileCharyred {

    public static void main(String[] arg) throws Exception {
        char[] ary = {'j', 'a', 'v', 'a'};
        CharArrayReader reader = new CharArrayReader(ary);
        int k = 0;
        while ((k = reader.read()) != -1) {
            char ch = (char) k;
            System.out.print(ch + " : ");
            System.out.println(k);
        }
    }
}
