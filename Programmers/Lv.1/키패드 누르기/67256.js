function solution(numbers, hand) {
    let answer = '';
    
    const keypad = {
        1: [0, 0], 2: [0, 1], 3: [0, 2],
        4: [1, 0], 5: [1, 1], 6: [1, 2],
        7: [2, 0], 8: [2, 1], 9: [2, 2],
        0: [3, 1]
    };
    
    let lefthand = [3, 0], righthand = [3, 2];
    
    numbers.forEach(number => {
       let pointer = (hand === 'left') ? 'L' : 'R';
        
        if (number === 1 || number === 4 || number === 7) {
            pointer = 'L';
        } else if (number === 3 || number === 6 || number === 9) {
            pointer = 'R';
        } else {
            const location = keypad[number];
            const leftcount = Math.abs(location[0] - lefthand[0]) + Math.abs(location[1] - lefthand[1]);
            const rightcount = Math.abs(location[0] - righthand[0]) + Math.abs(location[1] - righthand[1]);
            
            if (leftcount < rightcount) {
                pointer = 'L';
            } else if (leftcount > rightcount) {
                pointer = 'R';
            }
        }
        
        if (pointer === 'L') {
            answer += 'L';
            lefthand = keypad[number];
        } else {
            answer += 'R';
            righthand = keypad[number];
        }
    });
    
    return answer;
}
