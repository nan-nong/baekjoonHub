class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";

        // 해당 배열에 해당하는 숫자가 있으면 해당 배열를 빈칸으로 변경
        char[] charArray = my_string.toCharArray();
        for (int i = 0; i < indices.length; i++) {
            // 는 char는 빈문자로 초기화가 안됐다.
            charArray[indices[i]] = '_';
        }

        for (char c : charArray) {
            if (c != '_') {
                answer += c;
            }
        }
        return answer;
    }
}