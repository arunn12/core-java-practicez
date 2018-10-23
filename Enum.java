package pkgenum;

enum Day {
    Monday, Tuesday, Wednesday, Thursday, Friday
}

public class Enum {

    public static void main(String args[]) {
        Day day = Day.Friday;
        switch (day) {
            case Thursday:
                System.out.println("Sunday");
                break;
            case Monday:
                System.out.println("Monday");
                break;
            default:
                System.out.println("other day");
        }
    }

}
