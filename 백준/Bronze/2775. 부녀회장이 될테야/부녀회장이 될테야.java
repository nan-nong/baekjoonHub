import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] apart = new int[15][15];

        for(int i = 0 ; i < apart.length ; i++){
            apart[i][1] = 1;
            apart[0][i] = i;
        }

        for(int i = 1 ; i < 15 ; i++){
            for(int j = 2 ; j < 15 ; j++){
                apart[i][j] = apart[i][j-1] + apart[i-1][j];
            }
        }
        int testCase = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < testCase ; i++){
            int k = Integer.parseInt(br.readLine()); // k층
            int n = Integer.parseInt(br.readLine()); // n호
            System.out.println(apart[k][n]);
        }
        br.close();
    }
}