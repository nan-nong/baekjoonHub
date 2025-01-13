import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        /* M을 넘지 않으면서 M과 최대한 가깝게 만들어야 함 */
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 개수 N
        int M = Integer.parseInt(st.nextToken()); // 합 M
        int[] card = new int[N];
        int max = 0;

        st = new StringTokenizer(br.readLine());
        int index = 0 ;
        while(st.hasMoreTokens()){
            card[index] = Integer.parseInt(st.nextToken());
            index++;
        }

        // M 과 가장 가까운 합이 되려면... 삼중 포문으로 for 합산을 구한다음 Max로 넣고 if로 M 보다 작은지 체크해야겠다.

        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < i ; j++){
               for(int k = 0 ; k < j ; k++){
                   int result = card[i] + card[j] + card[k];
                   if(result > max && result <= M){
                       max = result;
                   }
               }
            }
        }

        bw.write(String.valueOf(max));

        br.close();
        bw.flush();
        bw.close();
    }
}