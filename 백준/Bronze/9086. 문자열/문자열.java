import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < testCase ; i++){
            String str = br.readLine();

            char[] charArray = str.toCharArray();
            if(charArray.length != 1) {
                System.out.println(String.valueOf(charArray[0]) + String.valueOf(charArray[charArray.length - 1]));
            } else {
                System.out.println(String.valueOf(charArray[0]) + String.valueOf(charArray[0]));
            }
        }
    }
}