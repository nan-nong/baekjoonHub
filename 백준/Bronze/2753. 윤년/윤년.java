import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        // 1. 윤년일 때,
        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}