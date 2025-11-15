function solution(a, b) {
    const DAY_OF_WEEK = ["SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"];
    const answer = DAY_OF_WEEK[new Date(2016, a-1, b).getDay()];    
    return answer;
}
