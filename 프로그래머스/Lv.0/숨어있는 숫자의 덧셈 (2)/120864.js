function solution(my_string) {
    let answer = 0;
    
    my_string.replaceAll(/[^0-9]/g, ",").split(",").forEach(v => {
        if (v !== "") answer += Number(v);
    });
    
    return answer;
}
