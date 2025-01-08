import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력받을 숫자 3개
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        String result = (a * b * c) + "";
        int[] arrayNum = Arrays.stream(result.split("")).mapToInt(Integer::parseInt).toArray(); // int 배열로 변경
        int[] countNum = new int[10];

        // 첫째 줄은 0이 몇 번 쓰였는지 출력
        // 둘째 줄 ~ 10번째 줄은 1부터 9까지 결과값 차례로 출력
        // 인덱스에 맞게 for문 체크해서 그 인덱스 ++하면 될 것같은데..?
        for(int i = 0 ; i < arrayNum.length ; i++){
            countNum[arrayNum[i]]++;
        }
        for (int i : countNum) {
            System.out.println(i);
        }
    }
}