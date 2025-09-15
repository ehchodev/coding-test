function solution(arr, n) {
    const l = arr.length;
    const answer = arr.map((v, i) => v + ( (l % 2 == 0 && i % 2 == 1) || (l % 2 == 1 && i % 2 == 0) ? n : 0 ));
    return answer;
}
