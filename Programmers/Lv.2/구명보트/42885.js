function solution(people, limit) {
    let answer = 0;
    
    people.sort((a, b) => a - b);
    
    let lastIndex = people.length;
    for (let i = 0; i < people.length; i++) {
        if (people[i] === 0) continue;
        
        while (i < lastIndex) {
            lastIndex--;
            
            if (people[i] + people[lastIndex] <= limit) {
                people[lastIndex] = 0;
                break;
            }
        }
        
        answer++;
    }
    
    return answer;
}
