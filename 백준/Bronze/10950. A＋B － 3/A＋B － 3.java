import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] result = new int[num];

        // 1. 입력받은 num 만큼 반복해서 입력할 수 있게 하기
        for(int i = 0 ; i < num ; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            result[i] = a + b;
        }

        for(int c : result){
            System.out.println(c);
        }

        scanner.close();
    }
}