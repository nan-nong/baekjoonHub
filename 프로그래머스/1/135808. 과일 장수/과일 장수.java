
import java.util.Arrays;

/**
 *  사과의 최대 점수 k
 *  한상자에 들어가는 사과 수 m
 *  사과 점수 score
 */
class Solution {
    public int solution(int appleHighScore, int appleCount, int[] score) {
        int answer = 0;
        // 최대 사과의 스코어와 맞는 score를 찾으면서 appleCount 개수만큼 잘라서 담은 다음 계산하기
        Arrays.sort(score);

        for(int i = score.length - appleCount; i >= 0 ; i -= appleCount){
            answer += score[i] * appleCount;
        }

        return answer;
    }
}