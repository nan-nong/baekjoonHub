import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 입력된 문자가 숫자인지 아닌지 판별해야함 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i = 0 ; i < num; i++){
            // 0에서 5까지
            for(int j = num; j > num - i; j--){
                System.out.print(" ");
            }
            // 5에서 0까지
            for(int j = 0 ; j < num - i ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        br.close();
    }
}