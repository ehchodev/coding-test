function solution(players, callings) {
    const answer = players;
    
    const rankObj = {};
    for (let i = 0; i < players.length; i++) {
        rankObj[players[i]] = i;
    }
    
    callings.forEach(calling => {
        const callingRank = rankObj[calling];
        const tempPlayer = players[callingRank - 1];
        
        rankObj[calling] = callingRank - 1;
        rankObj[tempPlayer] = callingRank;
        
        players[callingRank] = tempPlayer;
        players[callingRank - 1] = calling;
    });
    
    return answer;
}
