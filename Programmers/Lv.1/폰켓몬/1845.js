function solution(nums) {
    const answer = Math.min(nums.length / 2, new Set(nums).size);
    return answer;
}
