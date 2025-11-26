function solution(dartResult) {
    let answer = 0;
    
    const scores = [];
    let index = 0;
    
    for (let i = 0; i < dartResult.length; i++) {
        const c = dartResult.charAt(i);
        
        if (c === 'D') {
            scores[index - 1] = scores[index - 1] ** 2;
        } else if (c === 'T') {
            scores[index - 1] = scores[index - 1] ** 3;
        } else if (c === '*') {
            scores[index - 1] *= 2;
            if (index >= 2) scores[index - 2] *= 2;
        } else if (c === '#') {
            scores[index - 1] *= -1;
        } else if (c !== 'S') {
            if (dartResult.charAt(i + 1) === '0') {
                scores[index] = Number( dartResult.substr(i, 2) );
                i++;
            } else {
                scores[index] = Number( c );
            }
            index++;
        }
    }
    
    answer = scores.reduce((a, b) => a + b, 0);
    
    return answer;
}
