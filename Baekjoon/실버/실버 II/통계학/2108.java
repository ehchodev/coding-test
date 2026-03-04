import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int[] arr = new int[N];
        int[] cntArr = new int[8001];
        
        double sum = 0;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            sum += num;
            arr[i] = num;
            cntArr[num + 4000]++;
        }
        
        Arrays.sort(arr);
        
        int mean = (int) Math.round(sum / N);
        int median = arr[N / 2];
        
        int maxCnt = 0;
        for (int j = 0; j < 8001; j++) {
            maxCnt = Math.max(maxCnt, cntArr[j]);
        }
        
        List<Integer> list = new ArrayList<>();
        for (int k = 0; k < 8001; k++) {
            if (cntArr[k] == maxCnt) list.add(k - 4000);
        }
        
        int mode = (list.size() > 1) ? list.get(1) : list.get(0);
        int range = arr[N - 1] - arr[0];
        
        StringBuilder sb = new StringBuilder();
        sb.append(mean).append("\n").append(median).append("\n")
            .append(mode).append("\n").append(range);
        
        System.out.print(sb);
    }
}
