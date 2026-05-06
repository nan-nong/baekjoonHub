import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(int k, int[] scores) {
        int[] answer = new int[scores.length];
        int i = 0;
        // 삽입이 용이한 ArrayList로 만들기
        ArrayList<Integer> list = new ArrayList<>();

        for (int score : scores) {
            // list에 담을 때 score의 길이보다 적으면 담기
            if (list.size() < k) {
                list.add(score);
            } else {
                // 들어온 점수가 list에 있는 가장 작은 점수보다 클 때 기존 점수 지우고 추가
                if( score > list.get(0)) {
                    list.remove(0);
                    list.add(score);
                }
            }
            list.sort(Comparator.naturalOrder());
            answer[i] = list.get(0);
            i++;
        }
        return answer;
    }
}