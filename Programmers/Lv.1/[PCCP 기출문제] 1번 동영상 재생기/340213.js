function solution(video_len, pos, op_start, op_end, commands) {
    let answer = '';
    
    commands.forEach(command => {
        if (pos >= op_start && pos < op_end) {
            pos = op_end;
        }
        
        const time = pos.split(':');
        let hour = Number(time[0]), minute = Number(time[1]);
        minute += (command === 'prev') ? -10 : 10;
        
        if (minute >= 60) {
            hour++;
            minute -= 60;
        } else if (minute < 0) {
            hour--;
            minute += 60;
        }
        
        const maxTime = video_len.split(':');
        const maxHour = Number(maxTime[0]), maxMinute = Number(maxTime[1]);
        
        if (hour < 0) {
            pos = '00:00';
        } else if (hour > maxHour || (hour === maxHour && minute > maxMinute)) {
            pos = video_len;
        } else {
            pos = hour.toString().padStart(2, '0');
            pos += ':';
            pos += minute.toString().padStart(2, '0');
        }
    });
    
    if (pos >= op_start && pos < op_end) {
        pos = op_end;
    }
    
    answer = pos;
    
    return answer;
}
