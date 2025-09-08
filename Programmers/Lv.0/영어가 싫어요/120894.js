function solution(numbers) {
    let answer = 0;
    
    const arr = ['zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine'];
    for (let i=0; i<arr.length; i++) {
        answer = numbers.replaceAll(arr[i], i);
    }
    
    return answer;
}
