import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 최소값 최대값 구하는 프로그램
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());                  // 정수 개수 입력받기
        StringTokenizer st = new StringTokenizer(br.readLine());    // 정수 입력받기
        int max = 0;        // 최댓값
        int min = 0;        // 최소값
        int i = 0;

        // 첫번째 값만 먼저 max, min에 할당
        while(st.hasMoreTokens()){
            int number = Integer.parseInt(st.nextToken());
            if(i == 0){
                max = number;
                min = number;
            }
            // max보다 크면 max에 넣기
            if(max < number){
                max = number;
            }
            
            if(min > number){
                min = number;
            }
            i++;
        }
        System.out.print(min + " " + max);
    }
}