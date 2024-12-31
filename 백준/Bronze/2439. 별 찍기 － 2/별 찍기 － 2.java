import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for(int i = 1; i <= num ; i++){
            for (int j = 1; j <= num - i ; j++){
                System.out.print(" ");
            }
            for(int h = 0 ; h < i; h++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}