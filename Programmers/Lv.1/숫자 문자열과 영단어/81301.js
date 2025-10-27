function solution(s) {
    const arr = ['zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine'];
    let answer = 0;
    
    arr.forEach((v, i) => {
        s = s.replaceAll(v, i);
    });
    
    answer = Number(s);
    
    return answer;
}
