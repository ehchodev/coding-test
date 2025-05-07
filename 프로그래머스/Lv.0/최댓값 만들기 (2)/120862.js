function solution(numbers) {
    let answer = 0;
    
    numbers.sort((a, b) => a - b);
    
    const len = numbers.length - 1;
    answer = Math.max(numbers[0] * numbers[1], numbers[len] * numbers[len-1]);
    
    return answer;
}
