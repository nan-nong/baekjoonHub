import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        /* 단어 S의 i번째 글자 출력하기
        *  입력받은 글자를 char로 만들어서 배열에 넣고 그 배열에 인덱스 체크하기 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();                   // 단어 S
        int i = Integer.parseInt(br.readLine());    // 인덱스 i
        int j = 1;

        char[] charArray = s.toCharArray();
        for(char ch : charArray){
            if(j == i){
                System.out.println(ch);
            }
            j++;
        }
        

    }
}