import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 입력된 문자가 숫자인지 아닌지 판별해야함 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());                // 정수 N
        int num = 1;

        for(int i = 0 ; i < N ; i++){
            num *= (N - i);
        }

        System.out.println(num);

        br.close();
    }
}