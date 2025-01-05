import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        /* 문자열 반복
         첫째줄에 테스트 케이스 개수(T), 반복횟수는 R, 문자열 S가 공백으로 구분 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCount = Integer.parseInt(br.readLine());
        for(int j = 0; j < testCount; j++) {
            String[] input = br.readLine().split(" ");  // 공백으로 구분된 입력을 분리
            int repeat = Integer.parseInt(input[0]);     // 첫 번째 값은 반복 횟수
            String str = input[1];                       // 두 번째 값은 문자열

            String result = "";
            for(int i = 0; i < str.length(); i++) {
                result += String.valueOf(str.charAt(i)).repeat(repeat);
            }
            System.out.println(result);
        }
    }
}