function solution(num, k) {
    let answer = -1;
    
    const str = [...num.toString()];
    for (let i=0; i<str.length; i++) {
        if (str[i] === k.toString()) {
            answer = i + 1;
            break;
        }
    }
    
    return answer;
}
