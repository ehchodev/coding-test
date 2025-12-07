import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        
        Map<String, Map<String, Integer>> giftMap = new HashMap<>();
        Map<String, Integer> countMap = new HashMap<>();
        for (String friend : friends) {
            Map<String, Integer> map = new HashMap<>();
            giftMap.put(friend, map);
            countMap.put(friend, 0);
        }
        
        for (String gift : gifts) {
            String[] g = gift.split(" ");
            Map<String, Integer> gMap = giftMap.get(g[0]);
            gMap.put(g[1], gMap.getOrDefault(g[1], 0) + 1);
            countMap.put(g[0], countMap.get(g[0]) + 1);
            countMap.put(g[1], countMap.get(g[1]) - 1);
        }
        
        int[] nextMonth = new int[friends.length];
        for (int i = 0; i < friends.length - 1; i++) {
            Map<String, Integer> map = giftMap.get(friends[i]);
            for (int j = i + 1; j < friends.length; j++) {
                int num1 = map.getOrDefault(friends[j], 0);
                int num2 = giftMap.get(friends[j]).getOrDefault(friends[i], 0);
                if (num1 > num2) {
                    nextMonth[i]++;
                } else if (num1 < num2) {
                    nextMonth[j]++;
                } else if (num1 == num2) {
                    int cnt1 = countMap.get(friends[i]);
                    int cnt2 = countMap.get(friends[j]);
                    if (cnt1 > cnt2) {
                        nextMonth[i]++;
                    } else if (cnt2 > cnt1) {
                        nextMonth[j]++;
                    }
                }
            }
        }
        
        Arrays.sort(nextMonth);
        
        answer = nextMonth[nextMonth.length - 1];
        
        return answer;
    }
}
