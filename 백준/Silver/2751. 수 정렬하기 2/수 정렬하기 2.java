import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        // 음수를 포함해야 하므로 -1,000,000 ~ 1,000,000 범위 필요
        int[] arr = new int[2000001];  // 0을 포함하므로 2,000,001개
        StringBuilder sb = new StringBuilder();
        
        // 입력받은 값을 바로 count
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[num + 1000000] = 1;  // 음수를 양수 인덱스로 변환
        }
        
        // 정렬된 결과 출력
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
                sb.append(i - 1000000).append('\n');
            }
        }
        
        System.out.print(sb);
    }
}