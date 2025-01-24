import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] coordinate = new int[N][2];

        // N번 좌표 담기
        for(int i = 0 ; i < N ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            coordinate[i][0] = Integer.parseInt(st.nextToken());
            coordinate[i][1] = Integer.parseInt(st.nextToken());
        }

        // x좌표가 같을 때는, y좌표가 작은 숫자 순으로 정렬
        Arrays.sort(coordinate, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] - o2[0] == 0){
                    return o1[1] - o2[1];
                }
                return o1[0] - o2[0];
            }
        });
        for (int i = 0 ; i < N ; i++){
            System.out.print(coordinate[i][0] + " ");
            System.out.println(coordinate[i][1]);
        }
    }
}
