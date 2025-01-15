import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 입력된 문자가 숫자인지 아닌지 판별해야함 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1 = br.readLine();
        String s2 = br.readLine();
        String s3 = br.readLine();
        int result = 0 ;

        if(isNumber(s1)){
            result = Integer.parseInt(s1) + 3;
        } else if (isNumber(s2)) {
            result = Integer.parseInt(s2) + 2;
        } else if(isNumber(s3)){
            result = Integer.parseInt(s3) + 1;
        }

        if(result % 3 == 0 && result % 5 == 0){
            System.out.println("FizzBuzz");
        } else if (result % 3 == 0 && result % 5 != 0) {
            System.out.println("Fizz");
        } else if(result % 5 == 0 && result % 3 != 0){
            System.out.println("Buzz");
        } else {
            System.out.println(result);
        }
        br.close();
    }

    public static boolean isNumber(String str){
        return str.matches("^[0-9]*$");
    }
}