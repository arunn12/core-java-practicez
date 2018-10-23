package maps;

import java.util.*;

public class Maps {

    public static void main(String[] args) {
        Map m1 = new HashMap();
        m1.put("sun", "10");
        m1.put("light", "15");
        m1.put("moon", "20");
        m1.put("light", "33");
        System.out.println(" Map Elements");
        System.out.print(m1);
    }
}
