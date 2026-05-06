import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(n);

        while (n != 1) {
            if (n % 2 == 0) { // n이 짝수
                n = n / 2;
            } else { // b 홀수
                n = 3 * n + 1;
            }
            arrayList.add(n);
        }
        int[] answer = new int[arrayList.size()];
        int count = 0 ;

        for (int data : arrayList) answer[count++] = data;

        return answer;
    }
}