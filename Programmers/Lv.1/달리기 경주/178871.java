import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = players;
        
        Map<String, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            rankMap.put(players[i], i);
        }
        
        for (String calling : callings) {
            int callingRank = rankMap.get(calling);
            String tempPlayer = players[callingRank - 1];
            
            rankMap.put(calling, callingRank - 1);
            rankMap.put(tempPlayer, callingRank);
            
            players[callingRank] = tempPlayer;
            players[callingRank - 1] = calling;
        }
        
        return answer;
    }
}
