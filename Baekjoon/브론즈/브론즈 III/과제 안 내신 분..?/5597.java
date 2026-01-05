import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] arr = new int[30];
        for (int i = 0; i < 28; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[num - 1]++;
        }
        
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == 0) {
                System.out.println(j + 1);
            }
        }
    }
}
