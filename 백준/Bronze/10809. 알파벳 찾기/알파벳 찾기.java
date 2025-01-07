import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) throws IOException {
        /* 알파벳 a부터 0으로 시작, 단어에 포함 되어있으면 위치(인덱스)를 반환, 없으면 -1 반환 
        * char로 a는 97부터 시작, */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String[] split = S.split("");
        int[] alphabet = new int[26];
        int count = 0;

        // 각 char를 for문 돌려서 s의 index가 있는지 체크하고 없으면 -1을 반환, 있으면 그 index주기
//        for (String s : split) {
//            for (int i = 0 ; i < 26 ; i++){
//                if(s.charAt(0) == (char)i + 97){
//                    alphabet[count] = i;
//                    break;
//                } else {
//                    alphabet[count] = -1;
//                }
//            }
//            count++;
//        }
        // 안됨, 이건 string에 대한 그 자리를 획득하는 것임..
        // 1. 기본적으로 alphabet은 -1로 해놓고 자리만 치환하면 안될까?
//        for (int i : alphabet) {
//            alphabet[count] = -1;
//            count++;
//        }
        Arrays.fill(alphabet, -1);
        count = 0;

        // 2. 만약 문자열을 돌려서 알파벳이 존재한다면 그 알파벳의 index에, 치환될 알파벳의 index넣기
        for(String s : split){
            for (int i = 0 ; i <= 26 ; i++){
                if(s.charAt(0) == (char)i + 97){
                    // alphabet의 배열에 s를 훑었을 때, s에 있는 자리에 들어가야함.
                    if(alphabet[s.charAt(0)-97] == -1) {
                        alphabet[s.charAt(0)-97] = count;
                    }
                    break;
                }
            }
            count++;
        }

        for (int i : alphabet) {
            System.out.print(i + " ");
        }
    }
}