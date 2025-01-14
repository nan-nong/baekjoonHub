import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); //
        int count = 1;
        int range = 2;

        if(N == 1){
            bw.write(String.valueOf(1));
        } else {
            while(range <= N){
                range = range + (6 * count);
                count++;
            }
            bw.write(String.valueOf(count));
        }

        br.close();
        bw.flush();
        bw.close();
    }
}