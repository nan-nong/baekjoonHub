import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();     // 문자열
        char[] chars = str.toUpperCase().toCharArray();
        int[] freq = new int[256];
        char result = '?';
        int max = 0;
        boolean hasDuplicate = false;

        for(char ch : chars){
            freq[ch]++;
        }

        for(int i = 0 ; i < freq.length ; i++){
            if(freq[i] > 0 && freq[i] > max){
                result = (char)i;
                max = freq[i];
                hasDuplicate = false;
            } else if (freq[i] == max){
                hasDuplicate = true;
            }
        }

        System.out.println(hasDuplicate ? '?' : result);
        br.close();
    }
}
