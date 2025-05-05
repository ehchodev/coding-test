function solution(n) {
    let answer = 0;
    
    for (let i=1; i<=n; i++) {
        if (n < factorial(i)) break;
        answer = i;
    }
    
    return answer;
}

function factorial(num) {
    if (num === 1) return 1;
    return num * factorial(num - 1);
}
