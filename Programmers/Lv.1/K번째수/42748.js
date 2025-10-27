function solution(array, commands) {
    const answer = [];
    
    for (let i=0; i<commands.length; i++) {
        const [s, e, idx] = commands[i];
        const arr = [...array.slice(s - 1, e)].sort((a, b) => a - b);
        answer.push(arr[idx - 1]);
    }
    
    return answer;
}
