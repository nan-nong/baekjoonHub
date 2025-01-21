import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        int[][] val = new int[testCase][2];
        String[] str;

        // 키와 몸무게가 더 높으면 덩치가 큰 것 둘 중 하나만 높다면 등수는 똑같음.
        for(int i = 0 ; i < testCase ; i++){
            str = br.readLine().split(" ");
            val[i][0] = Integer.parseInt(str[0]);    // 몸무게
            val[i][1] = Integer.parseInt(str[1]);    // 키
        }

        for(int i = 0 ; i < testCase ; i++){
            int rank = 1;

            for(int j = 0 ; j < testCase ; j++){
                if(i == j){
                    continue;
                }
                if(val[i][0] < val[j][0] && val[i][1] < val[j][1]) rank++;
            }
            System.out.print(rank + " ");
        }

        System.out.println();
        br.close();
    }
}