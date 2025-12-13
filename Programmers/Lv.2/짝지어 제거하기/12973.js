function solution(s) {
    let answer = 0;

    const stack = [];
    [...s].forEach(v => {
       if (stack.length > 0 && stack[stack.length - 1] === v) {
           stack.pop();
       } else {
           stack.push(v);
       }
    });
    
    answer = (stack.length === 0) ? 1 : 0;

    return answer;
}
