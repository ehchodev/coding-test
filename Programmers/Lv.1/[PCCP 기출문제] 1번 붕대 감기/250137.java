class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        
        int maxHealth = health;
        int t = bandage[0]; // 시전 시간
        int x = bandage[1]; // 초당 회복량
        int y = bandage[2]; // 추가 회복량
        
        int continueCount = 0;
        int attackIndex = 0;
        for (int i = 1; i <= 1000; i++) {
            // 공격 O
            if (i == attacks[attackIndex][0]) {
                continueCount = 0;
                health -= attacks[attackIndex++][1];
                
                if (health < 0 || attackIndex == attacks.length) break;
                
            // 공격 X
            } else {
                continueCount++;
                health = health + x;
                if (continueCount == t) {
                    health += y;
                    continueCount = 0;
                }
                health = Math.min(maxHealth, health);
            }
        }
        
        answer = (health <= 0) ? -1 : health;
        
        return answer;
    }
}
