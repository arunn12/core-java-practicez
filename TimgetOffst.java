package timgetoffst;

import java.util.*;

public class TimgetOffst {

    public static void main(String args[]) {
        TimeZone zone;
        zone = TimeZone.getTimeZone("Asia/Kolkata");
        System.out.println("The Offset value of TimeZone: "
                + zone.getOffset(Calendar.ZONE_OFFSET));
    }
}
