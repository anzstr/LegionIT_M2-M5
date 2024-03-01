package M5_Arrays_and_Hashes_Assignment;
import java.util.*;

public class WeekDays {
    public String getDay(int day){
        if (day<1 || day>7){
            return "";
        }
        ArrayList<String> weekdays = new ArrayList<String>();
        weekdays.add("Sunday");
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");
        weekdays.add("Saturday");

        return weekdays.get(day-1);
    }
}
