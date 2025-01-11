import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // 팰린드롬수, 숫자를 반으로 나누고 앞에서 세었을 때와 뒤에서 부터 세었을 때가 동일하다면 팰린드롬 수.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String number = br.readLine(); // 입력 받은 넘버
            char[] numberArray = number.toCharArray();
            boolean isPalin = true;
            // number의 length를 반으로 나누고 그 부분까지 for문을 돌려서 뒤에서부터 세고, 
            // 앞에서부터 셌을 때 다 동일하다면 yes
            // 만약 중간에 다른 숫자가 있다면 break하고 no를 출력.
            for(int i = 0 ; i < number.length() / 2 ; i++){
                // 한자리수는 무조건 팰린드롬수 OK
//                if(number.length() == 1){
//                    isPalin = true;
//                }
                if(numberArray[i] == numberArray[numberArray.length - i -1]) {
                    isPalin = true;
                } else {
                    isPalin = false;
                    break;
                }
            }

            if(Integer.parseInt(number) == 0){
                break;
            }

            System.out.println((isPalin ? "yes" : "no"));
        }
    }
}