import java.util.*;

class Solution {
    /**
     * @param n : 인원수
     * @param words : 단어
     * 2차원 배열로 만들어서 담고 이전에 담긴 단어가 동일한지 체크
     * 요건 찾다가 안돼서 그냥 해답 확인..
     *
     */
    static public int[] solution(int n, String[] words) {
        int[] answer = {};
        Set<String> used = new HashSet<>();
        used.add(words[0]);
        char c = words[0].charAt(words[0].length() - 1);
        
        // for문 돌면서 해당 단어가 있는지 체크
        for (int i = 1; i < words.length; i++) {
            // 앞 단어의 마지막 문자와 현재 단어의 첫 문자가 다르거나, 중복 단어일 경우
            if (words[i].charAt(0) != c || !used.add(words[i])) {
                return new int[] {i % n + 1, i / n + 1};
            }
            c = words[i].charAt(words[i].length() - 1);
        }

        // 탈락자 없음
        return new int[] {0, 0};
    }
}