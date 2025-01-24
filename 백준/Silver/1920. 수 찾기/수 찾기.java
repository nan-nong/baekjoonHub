import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // N개의 정수
        String[] input = br.readLine().split(" ");
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            set.add(Integer.parseInt(input[i]));
        }

        // M개의 숫자 확인
        int M = Integer.parseInt(br.readLine());
        String[] check = br.readLine().split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            if (set.contains(Integer.parseInt(check[i]))) {
                sb.append("1\n");
            } else {
                sb.append("0\n");
            }
        }
        System.out.println(sb);
        br.close();
    }
}
