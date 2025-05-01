function solution(emergency) {
    const answer = [];
    const arr = [...emergency].sort((a, b) => b - a);
    
    emergency.forEach((v, i) => {
        for (let j=0; j<arr.length; j++) {
            if (v === arr[j]) {
                answer[i] = j + 1;
                break;
            }
        }
    });
    
    return answer;
}
