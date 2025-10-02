function solution(a, b, c, d) {
    let answer = 0;
    
    const numbers = [a, b, c, d].sort();
    const set = new Set(numbers);
    const size = set.size;
    
    if (size === 1) {
        answer = 1111 * a;
    } else if (size === 2) {
        if (numbers.filter(n => n === a).length === 1) {
            answer = (10 * b + a)**2;
        } else if (numbers.filter(n => n === b).length === 1) {
            answer = (10 * a + b)**2;
        } else if (numbers.filter(n => n === c).length === 1) {
            answer = (10 * a + c)**2;
        } else if (numbers.filter(n => n === d).length === 1) {
            answer = (10 * a + d)**2;
        } else {
            if (a == b) {
                answer = (a + c) * Math.abs(a - c);
            } else {
                answer = (a + b) * Math.abs(a - b);
            }
        }
    } else if (size === 3) {
        if (a === b) {
            answer = c * d;
        } else if (a === c) {
            answer = b * d;
        } else if (a === d) {
            answer = b * c;
        } else if (b === c) {
            answer = a * d;
        } else if (b === d) {
            answer = a * c;
        } else {
            answer = a * b;
        }
    } else {
        answer = Math.min(...numbers);
    }
    
    return answer;
}
