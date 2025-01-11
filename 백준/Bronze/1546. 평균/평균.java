import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());        // 과목 개수 n개
        Double sum = 0.0;

        double[] scores = Arrays.stream(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        Arrays.sort(scores);

        for (int i = 0 ; i < scores.length ; i++){
            sum += (scores[i] / scores[scores.length - 1]) * 100;
        }

        System.out.println(sum / scores.length);
    }
}