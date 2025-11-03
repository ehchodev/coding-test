class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for (int i=0; i<n; i++) {
            String[] arr = new String[n];
            
            for (int j=n-1; j>=0; j--) {
                int num = (int) Math.pow(2, j);
                if (arr1[i] >= num) {
                    arr[n - j - 1] = "#";
                    arr1[i] -= num;
                }
                
                if (arr2[i] >= num) {
                    arr[n - j - 1] = "#";
                    arr2[i] -= num;
                }
            }
            
            answer[i] = String.join("", arr).replaceAll("null", " ");
        }
        
        return answer;
    }
}
