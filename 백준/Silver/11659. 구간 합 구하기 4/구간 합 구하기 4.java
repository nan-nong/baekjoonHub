import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 수의 개수
        int M = Integer.parseInt(st.nextToken());   // 구해야하는 횟수
        int[] numbers = IntStream.concat(IntStream.of(0),
                                        Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt))
                                .toArray(); // 수
        int[] preSum = new int[N + 1];  // 누적합
        preSum[0] = 0;

        // 누적합 만들 numbers
        for(int i = 1 ; i <= N ; i++){
            preSum[i] = preSum[i - 1] + numbers[i];
        }

        // 구간합 구하기
        for(int k = 0 ; k < M ; k++){
            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            System.out.println(preSum[j] - preSum[i-1]);
        }
    }
}
