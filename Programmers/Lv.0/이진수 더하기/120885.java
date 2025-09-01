class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        
        int len1 = bin1.length();
        int len2 = bin2.length();
        int maxlen = Math.max(len1, len2) + 1;
        
        int[] arr1 = new int[maxlen];
        int[] arr2 = new int[maxlen];
        for (int i=0; i<maxlen; i++) {
            if (len1 > i) arr1[i] = Integer.parseInt(bin1.split("")[len1-1-i]);
            if (len2 > i) arr2[i] = Integer.parseInt(bin2.split("")[len2-1-i]);
        }
        
        int[] sumarr = new int[maxlen];
        int sum = 0;
        for (int j=0; j<maxlen; j++) {
            sum = sumarr[j] + arr1[j] + arr2[j];
            if (sum > 0) sumarr[j] = Math.abs(2 - sum);
            if (sum >= 2) sumarr[j+1] = 1;
        }
        
        for (int num : sumarr) answer = num + answer;
        if (answer.charAt(0) == '0') answer = answer.substring(1);
        
        return answer;
    }
}
