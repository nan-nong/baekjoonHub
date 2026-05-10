class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        // flag맞추기
        boolean flag = true;
        StringBuilder stringBuilder = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                flag = true;
            } else if (flag) {
                // 대문자로 변경
                c = Character.toUpperCase(c);
                flag = false;
            }
            answer = stringBuilder.append(c).toString();
        }
        return answer;
    }
}