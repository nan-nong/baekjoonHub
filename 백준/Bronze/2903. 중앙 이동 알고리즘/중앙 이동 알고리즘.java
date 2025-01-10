import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int a = 2; // 2부터 시작

        for(int i = 0 ; i < num ; i++){
            a = a + (a-1);
        }

        System.out.println(a * a);
    }
}