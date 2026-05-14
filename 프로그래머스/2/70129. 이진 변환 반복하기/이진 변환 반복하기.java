import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int removeZeroCount = 0;
        int count = 0;

        // 이진 변환 후 0 제거(개수 세기) 문자열 0제거 → 글자 길이를 이진 변환 → 반복
        // 길이가 1이 될때까지 반복
        while(true){
            String result = "";
            if(count > 0) {
                s = Integer.toBinaryString(s.length());
            }
            for (char c : s.toCharArray()) {
                if(c == '0'){
                    removeZeroCount++;
                } else if(c == '1'){
                    result += c;
                }
                s = result;
            }
            count++;

            if(result.length() == 1) break;
        }

        answer[0] = count;
        answer[1] = removeZeroCount;

        return answer;
    }
}