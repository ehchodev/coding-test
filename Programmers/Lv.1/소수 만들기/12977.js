function solution(nums) {
    let answer = 0;
    
    for (let a = 0; a < nums.length - 2; a++) {
        for (let b = a + 1; b < nums.length - 1; b++) {
            for (let c = b + 1; c < nums.length; c++) {
                const sum = nums[a] + nums[b] + nums[c];
                let isPrime = true;
                for (let n = 2; n*n <= sum; n++) {
                    if (sum % n === 0) {
                        isPrime = false;
                        break;
                    }
                }
                
                if (isPrime) {
                    answer++;
                }
            }
        }
    }
    
    return answer;
}
