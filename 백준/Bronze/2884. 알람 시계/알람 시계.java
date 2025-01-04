import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 45분 일찍 알람 설정하기
        // 분에서 45분을 뺐을 때, 만약 -가 되면 시에서 1빼기,
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        // minute이 45이상일 때
        if(minute >= 45){
            minute -= 45;

        } else if(minute < 45){            // 45미만일 시,
            // 여기서 만약 hour가 0일 때,  minute을 23으로 변경해주기
            if(hour == 0){
                hour = 23;
                minute = 60 + minute - 45;
            } else {
                minute = 60 + minute - 45;
                hour -= 1;
            }
        }
        System.out.print(hour + " " + minute);
    }
}