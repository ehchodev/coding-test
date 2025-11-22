function solution(babbling) {
    let answer = 0;
    
    const arr = ["aya", "ye", "woo", "ma"];
    babbling.forEach(b => {
        arr.forEach(a => {
            if (b.includes(a.repeat(2))) return;
            b = b.replaceAll(a, " ");
        });
        
        if (b.trim() === "") answer++;
    });
    
    return answer;
}
