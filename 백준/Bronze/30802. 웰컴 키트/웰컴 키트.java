import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());  // 참가자수 N
        int[] sizeArr = new int[6];                  // S, M, L, XL, XXXL, XXXXL 총 6개

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 사이즈 개수 입력
        for(int i = 0 ; i < 6; i++){
            sizeArr[i] = Integer.parseInt(st.nextToken()); // 옷 size
        }

        // 티셔츠, 펜 묶음 수 입력받기(공백으로 2번 입력받기)
        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());   // 티셔츠 묶음 수
        int P = Integer.parseInt(st.nextToken());   // 펜 묶음 수
        int tCnt = 0; // 티셔츠 주문 수

        // 티셔츠는 size별로 T를 나눴을 때, 갯수를 추가하고 만약 여기서 몫이 0초과라면 cnt를 하나 더 추가함
        for(int i = 0 ; i < sizeArr.length; i++){
            tCnt += sizeArr[i] / T;
            if(sizeArr[i] % T > 0){
                tCnt++;
            }
        }

        System.out.println(tCnt);
        System.out.println(N / P + " " + N % P);

    }
}