import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";

        /* 입력 받은 lien이 null이 아니면서 비어있지 않을 때, 반복 */
        while((line = br.readLine()) != null && !line.isEmpty()){
            String[] strings = line.split(" "); // 공백으로 구분해주기~
            int a = Integer.parseInt(strings[0]);
            int b = Integer.parseInt(strings[1]);

            if(a+b != 0){
                System.out.println(a + b);
            }
        }
    }
}