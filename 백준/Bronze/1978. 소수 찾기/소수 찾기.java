import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        /* 소수 찾기 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());        // n개의 숫자
//        List<Integer> primeNum = new ArrayList<>();     // 소수 숫자
        int primNumCount = 0;

        String line = br.readLine();
        int[] numbers = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();

        // 자기자신과 1만으로 나누어 떨어지는 1보다 큰 정수
        for(int num : numbers){
            int count = 0;
            for(int j = 1 ; j <= num ; j++){
                if(num % j == 0){
                    count++;
                }

            }
            if(count == 2){
                primNumCount++;
            }
        }

        System.out.println(primNumCount);
    }
}