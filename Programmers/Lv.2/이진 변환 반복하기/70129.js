function solution(s) {
    let [count, zeroCount] = [0, 0];
    
    while (s !== '1') {
        const length = s.replace(/0/g, '').length;
        zeroCount += (s.length - length);
        s = length.toString(2);
        count++;
    }
    
    return [count, zeroCount];
}
