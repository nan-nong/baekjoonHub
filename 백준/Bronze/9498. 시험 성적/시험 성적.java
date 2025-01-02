import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            int read = Integer.parseInt(reader.readLine());
            if(read >= 90) {
                System.out.println("A");
            } else if(read >= 80){
                System.out.println("B");
            } else if(read >= 70){
                System.out.println("C");
            } else if(read >= 60){
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        } catch (Exception e){
            e.getStackTrace();
        }
    }
}