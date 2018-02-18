package HackerRank_30_Days_of_Code.Day14_Scope.Day14_Tutorial;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarPractice {
    /**
     * TYPES OF PACKAGES
     * 1. USER-DEFINED PACKAGES
     * 2. BUILT-IN PACKAGES:
     * import java.util.Scanner; - LESS TIME FOR IMPORT 1 CLASS
     * VS
     * import java.util.*; - MORE TIME FOR IMPORT ALL CLASSES IN PACKAGE
     */
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE,0);
        System.out.println(cal.getTime());
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        String formatted = format1.format(cal.getTime());
        System.out.println(formatted);
    }
}
