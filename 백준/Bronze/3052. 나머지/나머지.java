import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] remains = new int[10];                 // 나머지 담을 배열
        int count = 0;

        // remains 배열에 담기
        for (int i = 0 ; i < 10 ; i++){
            int num = Integer.parseInt(br.readLine());    // 입력받을 숫자
            int mod = num % 42;
            boolean isDuplicate = false;                  // 중복 체크

            // 그런데 안에서 또 순회했을 때, 동일한 숫자가 있는지 체크하고 넣기
            for(int j = 0 ; j < count ; j++){
                if(remains[j] == mod){
                    isDuplicate = true;
                    break;
                }
            }

            // mod 중복체크한거 체크해서 담기
            if(!isDuplicate){
                remains[count] = mod;
                count++;
            }
        }

        System.out.println(count);
    }
}