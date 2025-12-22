function solution(elements) {
    let answer = 0;
    
    const set = new Set();
    const arr = [...elements, ...elements];
    
    for (let i = 0; i < elements.length; i++) {
        let sum = 0;
        for (let j = 0; j < elements.length; j++) {
            sum += arr[i + j];
            set.add(sum);
        }
    }
    
    answer = set.size;
    
    return answer;
}
