import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());       // 올라가는 높이
        int B = Integer.parseInt(st.nextToken());       // 내려오는 높이
        int V = Integer.parseInt(st.nextToken());       // 나무 높이
        int days = 0;

        // for문 사용시 시간 초과 발생
        days += (V - B) / (A - B);
        if((V - A) % (A - B) != 0) days++;

        System.out.println(days);
        br.close();
    }
}