package timzon;

import java.util.*;

public class TimZon {

    public static void main(String args[]) {
        String[] s = TimeZone.getAvailableIDs();
        System.out.println("In TimeZone class available Ids are: ");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
