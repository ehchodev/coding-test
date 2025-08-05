function solution(array) {
    let answer = 0;
    
    const mid = parseInt(array.length / 2);
    array.sort((a, b) => a - b);
    answer = array[mid];
    
    return answer;
}
