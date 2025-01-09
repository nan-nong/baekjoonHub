import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        
        /* h는 세로 w는 가로 n은 배정되어야 하는 방번호
        *  만약 w가 같다면, h는 낮은 곳을 선호.
        *  101 -> 201 -> ~~ -> 601호 까지 채운 다음, 102 -> 202 -> 순으로 증가 */
        for(int i = 0 ; i < testCase ; i++){
            int[] hotel = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int h = hotel[0]; // 높이(호텔 층 수)
            int w = hotel[1]; // 가로(호텔 각 층의 방 수)
            int n = hotel[2]; // 몇 번째 손님
            int count = 0;
            int result1 = 0;
            int result2 = 0;

            // 입력받은 n번째 손님을 h횟수 만큼 돌린 다음, w를 돌리고 횟수가 맞는 부분을 체크해서 방번호를 출력하기
            for(int j = 1 ; j <= w ; j++){
                for(int k = 1 ; k <= h ; k++){
                    count++;
                    if(count == n){
                        result1 = k;
                        result2 = j;
                        break;
                    }
                }
            }

            if(result2 < 10){
                System.out.println(result1 + "0" + result2);
            } else {
                System.out.println("" + result1 + result2);
            }
        }
    }
}