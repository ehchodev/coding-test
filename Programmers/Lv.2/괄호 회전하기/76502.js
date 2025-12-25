function solution(s) {
    let answer = 0;
    
    const sLength = s.length;
    s = s.repeat(2);
    
    for (let i = 0; i < sLength; i++) {
        const stack = [];
        
        for (let j = i; j < i + sLength; j++) {
            const c = s.charAt(j);
            
            if (c === '(' || c === '{' || c === '[') {
                stack.push(c);
            } else {
                if (stack.length === 0) {
                    stack.push(c);
                    break;
                }
                
                const p = stack[stack.length - 1];
                if ((c === ')' && p === '(') || (c === '}' && p === '{') || (c === ']' && p === '[')) {
                    stack.pop();
                }
            }
        }
        
        if (stack.length === 0) answer++;
    }
    
    return answer;
}
