class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        
        for (String command : commands) {
            if (pos.compareTo(op_start) >= 0 && pos.compareTo(op_end) < 1) {
                pos = op_end;
            }
            
            String[] time = pos.split(":");
            int hour = Integer.parseInt(time[0]);
            int minute = Integer.parseInt(time[1]);
            minute += ("prev".equals(command)) ? -10 : 10;;
            
            if (minute >= 60) {
                hour++;
                minute -= 60;
            } else if (minute < 0) {
                hour--;
                minute += 60;
            }
            
            String[] maxTime = video_len.split(":");
            int maxHour = Integer.parseInt(maxTime[0]);
            int maxMinute = Integer.parseInt(maxTime[1]);
            
            if (hour < 0) {
                pos = "00:00";
            } else if (hour > maxHour || (hour == maxHour && minute > maxMinute)) {
                pos = video_len;
            } else {
                pos = String.valueOf(String.format("%02d", hour));
                pos += ":";
                pos += String.valueOf(String.format("%02d", minute));
            }
        }
        
        if (pos.compareTo(op_start) >= 0 && pos.compareTo(op_end) < 1) {
            pos = op_end;
        }
        
        answer = pos;
        
        return answer;
    }
}
