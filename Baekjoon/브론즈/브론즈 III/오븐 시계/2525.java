import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int add = Integer.parseInt(br.readLine());
        
        int time = (hour * 60) + minute + add;
        hour = time / 60;
        if (hour >= 24) hour -= 24;
        minute = time % 60;
        
        System.out.println(hour + " " + minute);
    }
}
