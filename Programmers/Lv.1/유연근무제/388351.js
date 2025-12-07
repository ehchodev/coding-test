function solution(schedules, timelogs, startday) {
    let answer = timelogs.length;
    
    for (let i = 0; i < timelogs.length; i++) {
        for (let j = 0, start = startday; j < timelogs[i].length; j++, start++) {
            if (start % 7 === 0 || start % 7 === 6) continue;
            
            let expired = schedules[i] + 10;
            if (expired % 100 >= 60) expired += 40;
            
            if (timelogs[i][j] > expired) {
                answer--;
                break;
            }
        }
    }
    
    return answer;
}
