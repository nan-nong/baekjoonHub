import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i = 0 ; i < testCase ; i++ ){
            String s = br.readLine();

            if(s.equals("Never gonna give you up")) {
                count++;
            } else if(s.equals("Never gonna let you down")){
                count++;
            } else if (s.equals("Never gonna run around and desert you")) {
                count++;
            } else if (s.equals("Never gonna make you cry")) {
                count++;
            } else if (s.equals("Never gonna say goodbye")) {
                count++;
            } else if (s.equals("Never gonna tell a lie and hurt you")) {
                count++;
            } else if (s.equals("Never gonna stop")) {
                count++;
            }
        }

        if(count == testCase) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}