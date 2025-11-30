function solution(survey, choices) {
    let answer = '';
    
    const obj = {
        'R' : 0, 'T' : 0,
        'C' : 0, 'F' : 0,
        'J' : 0, 'M' : 0,
        'A' : 0, 'N' : 0
    };
    
    survey.forEach((v, i) => {
       const c = choices[i];
        
        if (c > 4) {
            obj[v.charAt(1)] += c - 4;
        } else {
            obj[v.charAt(0)] += 4 - c;
        }
    });
    
    answer += (obj['R'] >= obj['T']) ? 'R' : 'T';
    answer += (obj['C'] >= obj['F']) ? 'C' : 'F';
    answer += (obj['J'] >= obj['M']) ? 'J' : 'M';
    answer += (obj['A'] >= obj['N']) ? 'A' : 'N';
    
    return answer;
}
