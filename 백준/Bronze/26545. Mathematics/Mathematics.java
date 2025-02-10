import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i = 0; i < testCase ; i++){
            int num = Integer.parseInt(br.readLine());

            sum += num;
        }

        System.out.println(sum);
    }
}