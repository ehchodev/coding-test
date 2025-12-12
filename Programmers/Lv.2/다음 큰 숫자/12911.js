function solution(n) {
    let answer = n;
    
    const countN = [...n.toString(2)].filter(v => v === "1").length;
    
    let count = 0;
    while (count !== countN) {
        count = [...(++answer).toString(2)].filter(v => v === "1").length;
    }
    
    return answer;
}
