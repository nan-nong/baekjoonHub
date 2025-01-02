import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 1. 입력 받을 N개의 숫자
        int count = Integer.parseInt(reader.readLine());
        int result = 0;
        char[] chars = reader.readLine().toCharArray();

        // 2.
        for(char num : chars){
            // 찾아보니 ASCII 코드로 '0'을 빼주면 int로 변환할 수 있다고 한다. 또는 Character Class의 NumbericValue 사용
            result += Character.getNumericValue(num);
        }
        System.out.println(result);
    }
}