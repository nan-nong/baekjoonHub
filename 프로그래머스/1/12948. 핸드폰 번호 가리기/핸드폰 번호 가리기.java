class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char[] phoneNumberCharArray = phone_number.toCharArray();

        // 뒤에서부터 돌면서 4번째 이후부터 *로 변경
        for (int i = phoneNumberCharArray.length - 5; i >= 0; i--) {
            phoneNumberCharArray[i] = '*';
        }
        for (char c : phoneNumberCharArray) {
            answer += c;
        }

        return answer;
    }
}