import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 0 0 0이 입력되기 전까지 반복
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            // 피타고라스 정리식 사용 c*c 는 (a*a) + (b*b)가 같아야 직각 삼각형이다.


            if(a == 0 && b == 0 && c == 0){
                break;
            }

            if(((c*c) == ((a*a) + (b*b))) || ((b*b) == ((a*a) + (c*c))) || ((a*a) == ((b*b) + (c*c)))){
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }

        }
        br.close();
    }
}