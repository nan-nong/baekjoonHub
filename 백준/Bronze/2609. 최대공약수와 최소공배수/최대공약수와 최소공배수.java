import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int gcd = 0; // 최대공약수
        int lcm = 0; // 최소공배수

        // 최대공약수
        for(int i = Math.max(a,b) ; i >= 1 ; i--){
            if (a % i == 0 && b % i == 0) {
                gcd = i;
                break;
            }
        }

        // 최소공배수
        lcm = gcd * (a / gcd) * (b / gcd);
        System.out.println(gcd + " " + lcm);

        br.close();
    }
}