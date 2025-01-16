import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 입력된 문자가 숫자인지 아닌지 판별해야함 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder st = new StringBuilder();

        int N = Integer.parseInt(br.readLine());                // N개 단어
        List<String> list = new ArrayList<>();

        // 1. 입력되어있지 않은지 체크해서 list에 추가하기
        for(int i = 0 ; i < N ; i++){
            String s = br.readLine();
            if(!list.contains(s)){
                list.add(s);
            }
        }

        // 2. list의 문자 길이로 정렬
        list.sort((str1, str2) -> str1.length() - str2.length());

        // 3. list의 알파벳 순으로 정렬하기(길이동일시)
        list.sort((str1, str2) -> {
            if(str1.length() == str2.length()) return str1.compareTo(str2);
            return str1.length() - str2.length();
        });

        list.forEach(s -> System.out.println(s));
    }
}