function solution(n) {
    const answer = [];
    
    let num = 2;
    while (n > 1) {
        if (n % num === 0) {
            if (!answer.includes(num)) answer.push(num);
            n /= num;
        } else {
            num++;
        }
    }
    
    return answer;
}
