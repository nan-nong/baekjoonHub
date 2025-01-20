import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/* 입력된 문자가 숫자인지 아닌지 판별해야함 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        BigInteger factorial = BigInteger.ONE;
        int count = 0;      // 0의 개수 체크

        for(int i = 1 ; i <= num ; i++){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        // 생성된 factorial을 문자열로 변경해서 indexOf로 문자열 읽고 0이 아닌수가 나올때까지 count증가
        char[] chars = String.valueOf(factorial).toCharArray();
        for(int i = chars.length - 1 ; i > 0 ; i--){
            if(chars[i] == '0'){
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
        br.close();
    }
}