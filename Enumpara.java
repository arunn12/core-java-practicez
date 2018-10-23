package enumpara;

public class Enumpara {

    enum Day {
        monday(2), sunday(1), friday(6);
        public int value;

        Day(int v) {
            value = v;
        }

        int getValue() {
            return value;
        }
    }

    public static void main(String args[]) {
        System.out.println("All days:");
        for (Day d : Day.values()) {
            System.out.println(d + " value " + d.getValue());
        }
    }
}
