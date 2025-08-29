function solution(chicken) {
    let answer = 0;
    
    while (chicken >= 10) {
        answer++;
        chicken -= 9;
    }
    
    return answer;
}
