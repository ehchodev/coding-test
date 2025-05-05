function solution(my_string) {
    let answer = 0;
    
    my_string.replace(/[a-zA-Z]/g, '').split('').forEach(v => {
        answer += Number(v);
    });
    
    return answer;
}
