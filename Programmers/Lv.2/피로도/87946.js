function solution(k, dungeons) {
    let answer = 0;
    
    const visited = new Array(dungeons.length).fill(false);
    
    function dfs(currK, dungeons, visited, cnt) {
        answer = Math.max(answer, cnt);
        
        for (let i = 0; i < dungeons.length; i++) {
            if (!visited[i] && currK >= dungeons[i][0]) {
                visited[i] = true;
                dfs(currK - dungeons[i][1], dungeons, visited, cnt + 1);
                visited[i] = false;
            }
        }
    }
    
    dfs(k, dungeons, visited, 0);
    
    return answer;
}

