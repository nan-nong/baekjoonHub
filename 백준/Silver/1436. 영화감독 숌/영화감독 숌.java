import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int title = 0, count = 0;
        
        while(true){
            title++;
            // 무한으로 돌면서 문자열이 포함되어있는지 체크
            if(String.valueOf(title).contains("666")){
                count++;
            }
            if(count == num){
                break;
            }
        }
        System.out.println(title);
        br.close();
    }
}