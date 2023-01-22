import java.time.DayOfWeek;
import java.time.LocalDate;

public class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] dayOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek days = date.getDayOfWeek();
        int index = days.getValue();
        if(index == 7) index = 0;
        return dayOfWeek[index];
    }
}
