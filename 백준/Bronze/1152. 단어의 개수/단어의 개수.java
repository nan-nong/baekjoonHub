import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* The Curious Case of Benjamin Button 단어의 개수*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
//        System.out.println(st.countTokens());

        // Tokenizer class를 사용하지않고 하는 방법은?
        String str = br.readLine();
        int count = 0;
        boolean prev = false;

        // string을 잘라서 길이만큼 하나씩 돌리고 공백 개수 세고 +1? (안되네 ㅎ)
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) != ' ' && !prev){
                prev = true;
                count++;
            } else if(str.charAt(i) == ' '){
                prev = false;
            }
        }

        System.out.println(count);

    }
}