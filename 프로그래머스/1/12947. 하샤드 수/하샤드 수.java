class Solution {
    public boolean solution(int x) {
       // 각 자리수를 String 및 char로 변경,
        // 다시 int값으로 바꿔서 합산한 후 x로 나누기
        boolean answer = false;
        int result = 0;
        char[] xChar = String.valueOf(x).toCharArray();

        for (char c : xChar) {
            result += c - '0';
            System.out.println(result);
        }

        if(x % result == 0){
            answer = true;
        }

        return answer;
    }
}