class Solution {
    public int solution(String t, String p) {
        int answer = 0;

        // t문자열 길이 - p문자열 길이
        // int타입은 x..
        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            String str = t.substring(i, i + p.length());
            if (Long.parseLong(str) <= Long.parseLong(p)) {
                answer++;
            }
        }
        return answer;
    }
}