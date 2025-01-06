import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        /* 1 ~ 8 까지 순서대로 라면 ascending, 8 ~ 1이라면 descending, 그것도 아니라면 mixed */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 기억해두기!!! Stream사용해서 String을 int로
        int[] num = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int caseNum = 0;

        // for문을 돌면서 0부터 체크해서 j와 맞으면 ascending 길이-j라면 descending, 그 외는 mixed로 한다.
        for (int i = 0; i < num.length ; i++){
            if(num[i] == i + 1){
                caseNum++;
            } else if(num[i] == num.length - i){
                caseNum--;
            }
        }

        if(caseNum == 8){
            System.out.println("ascending");
        } else if (caseNum == -8){
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }

    }
}