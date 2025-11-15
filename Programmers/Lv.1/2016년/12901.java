import java.time.DayOfWeek;
import java.time.LocalDate;

class Solution {
    
    final String[] DAY_OF_WEEK = {"", "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    
    public String solution(int a, int b) {
        String answer = "";
        
        LocalDate date = LocalDate.of(2016, a, b);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        
        int dayOfWeekNumber = dayOfWeek.getValue();
        answer = DAY_OF_WEEK[dayOfWeekNumber];
        
        return answer;
    }
}
