import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 입력된 문자가 숫자인지 아닌지 판별해야함 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        /* 이항계수 공식 사용 */
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int m = n - k;
        int resultN = 1, resultK = 1, resultM = 1, result = 0;


        for(int i = 0 ; i < n ; i++){
            resultN *= (n-i);
        }
        for(int i = 0 ; i < m ; i++){
            resultM *= (m-i);
        }
        for(int i = 0 ; i < k ; i++){
            resultK *= (k-i);
        }
        result = resultN / resultM / resultK;
        System.out.println(result);

        br.close();
    }
}