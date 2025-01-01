import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 정수 N개, X보다 작은 수를 입력받은 순서대로 공백으로 출력
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int[] num = new int[N];
        String nums = "";

        // 2. N개 입력받은 만큼 number 입력 받기
        for(int i = 0; i < N ; i++){
            num[i] = scanner.nextInt();

            // 3. 입력받은 num 체크해서 1보다 크거나 같고, X보다 작은지 체크하기
            if(num[i] < X) {
                nums += num[i];
                nums += " ";
            }
        }

        System.out.println(nums);
    }
}