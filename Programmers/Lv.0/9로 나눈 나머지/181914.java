import java.math.BigInteger;

class Solution {
    public int solution(String number) {
        int answer = new BigInteger(number).remainder(new BigInteger("9")).intValue();
        return answer;
    }
}
