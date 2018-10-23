package sets;

import java.util.*;

public class Sets {

    public static void main(String args[]) {
        int count[] = {7, 5, 6, 3, 9, 2};
        Set<Integer> set = new HashSet<>();
        try {
            for (int i = 0; i <= 5; i++) {
                set.add(count[i]);
            }
            TreeSet sortedSet = new TreeSet<>(set);
            System.out.println("The sorted list is:");
            System.out.println(sortedSet);
            System.out.println("The First element of the set is: " + (Integer) sortedSet.first());
            System.out.println("The last element of the set is: " + (Integer) sortedSet.last());
        } catch (Exception e) {
            System.out.println();
        }
    }
}
