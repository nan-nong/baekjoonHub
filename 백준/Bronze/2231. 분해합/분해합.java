import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        /* 생성자가 되려면 최소값 부터 더해서 찾아야봐야한다.
        *  여기서 헷깔려서 검색해서 풀었는데,..`브루트포스 방식`으로 1씩 입력받아 대입해서 생성자있으면 그 값을 출력하면 된다고 함
        *  헷깔렸는데 출력되는 값을 분해합으로 전개하면 입력값이 된다는 뜻이다. 
        *  즉 나와야 되는 값을 분해합으로 만들면 입력된 자연수 N이라는 것. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); // 자연수 N
        int result = 0; // 생성자

        for(int i = 0 ; i < N ; i++){
            int number = i;
            int sum = 0;

            // 이 while문은 number의 각 자릿수를 더하는 반복문임
            while(number != 0){
                sum += number % 10;
                number /= 10;
            }

            // 생성자일 경우
            if(sum + i == N){
                result = i;
                break;
            }
        }

        bw.write(String.valueOf(result));

        br.close();
        bw.flush();
        bw.close();
    }
}