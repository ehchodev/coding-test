function solution(s){
    let answer = true;
    
    const stack = [];
    
    for (const str of s) {
        if (str === '(') {
            stack.push(str);
        
        } else {
            if (stack.length === 0) {
                stack.push(str);
                break;
            }
            stack.pop();
        }
    }
    
    answer = (stack.length === 0);

    return answer;
}
