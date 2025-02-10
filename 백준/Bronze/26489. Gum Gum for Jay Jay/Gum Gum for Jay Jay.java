import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫번째에 입력된 케이스와 String의 equals로 비교해서 똑같으면 count증가하기
        int count = 0;  // 개수

        while (true) {
            String s = br.readLine();
            if(s == null){
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}