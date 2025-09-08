function solution(my_string, num1, num2) {
    let answer = '';
    
    const arr = [...my_string];
    const temp = arr[num1];
    arr[num1] = arr[num2];
    arr[num2] = temp;
    
    answer = arr.join('');
    
    return answer;
}
