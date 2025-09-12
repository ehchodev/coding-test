function solution(n) {
    const answer = new Array(n);
    for (let a=0; a<n; a++) answer[a] = new Array(n);
    
    let l = 1; // 반복횟수
    let d = 1; // 방향 (1: 오른쪽, 2: 아래, 3: 왼쪽, 4: 위)
    
    let i = 0, j = 0;
    for (let num=1; num<=n*n; num++) {
        answer[i][j] = num;
        
        if (d === 1) {
            if (j < n - l) {
                j++;
            } else {
                i++;
                d++;
            }
        } else if (d === 2) {
            if (i < n - l) {
                i++;
            } else {
                j--;
                d++;
            }
        } else if (d === 3) {
            if (j >= l) {
                j--;
            } else {
                i--;
                d++;
            }
        } else if (d === 4) {
            if (i > l) {
                i--;
            } else {
                j++;
                l++;
                d = 1;
            }
        }
    }
    
    return answer;
}
