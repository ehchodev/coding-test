function solution(bandage, health, attacks) {
    let answer = 0;
    
    const maxHealth = health;
    const [t, x, y] = bandage;
    
    let continueCount = 0, attackIndex = 0;
    for (let i = 1; i <= 1000; i++) {
        if (i === attacks[attackIndex][0]) {
            continueCount = 0;
            health -= attacks[attackIndex++][1];
            
            if (health < 0 || attackIndex === attacks.length) break;
        
        } else {
            continueCount++;
            health = health + x;
            if (continueCount === t) {
                health += y;
                continueCount = 0;
            }
            health = Math.min(maxHealth, health);
        }
    }
    
    answer = (health <= 0) ? -1 : health;
    
    return answer;
}
