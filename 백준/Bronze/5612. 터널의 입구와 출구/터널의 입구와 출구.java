import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 시간
        int m = Integer.parseInt(br.readLine()); // 차랑의 수
        int max = m;

        for (int i = 0 ; i < n ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int throughCar1 = Integer.parseInt(st.nextToken()); // 입구를 통과한 차의 수
            int throughCar2 = Integer.parseInt(st.nextToken()); // 출구를 통과한 차의 수

            m += throughCar1;
            m -= throughCar2;
            max = Math.max(max, m);

            if(m < 0 ) {
                max = 0;
                break;
            }
        }
        System.out.println(max);
    }
}