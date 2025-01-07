import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCaseCount = Integer.parseInt(br.readLine());
        int[] result = new int[testCaseCount];

        // 횟수만큼 반복
        for(int i = 0 ; i < testCaseCount ; i++){
            String[] ox = br.readLine().split("");
            int count = 0;

            // 지금의 인덱스가 "O"이고, 이전의 인덱스가 존재하면서 O일 때 count ++해준다. 아니라면 count초기화
            for(int j = 0 ; j < ox.length ; j++){
                if(ox[j].equals("O")){
                    count++;
                } else {
                    count = 0;
                }
                result[i] += count;
            }
        }
        for (int i : result) {
            System.out.println(i);
        }
    }
}