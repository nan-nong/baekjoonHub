import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.next());

        for(int i = 0; i < count ; i++){
            for (int j = 0 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}