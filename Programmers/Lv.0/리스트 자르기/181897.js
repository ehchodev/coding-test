function solution(n, slicer, num_list) {
    const answer = [];
    
    const [a, b, c] = slicer;
    const start = (n === 1) ? 0 : a;
    const end = (n === 2) ? num_list.length-1 : b;
    const step = (n === 4) ? c : 1;
    
    for (let i=start; i<=end; i+=step) {
        answer.push(num_list[i]);
    }
    
    return answer;
}
