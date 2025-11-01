function solution(cards1, cards2, goal) {
    let answer = 'Yes';
    
    let idx1 = 0, idx2 = 0;
    for (const str of goal) {
        if (idx1 < cards1.length && str === cards1[idx1]) {
            idx1++;
            continue;
        }
        
        if (idx2 < cards2.length && str === cards2[idx2]) {
            idx2++;
            continue;
        }
        
        answer = "No";
        break;
    }
    
    return answer;
}
