import java.util.Stack;

/**
 * '('로 열렸을 시 ')'로 닫혀야 올바른 값이 나옴
 * 케이스 2개 안됨.. 다시 체크
 */
class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        char[] charArray = s.toCharArray();

        for (char c : charArray) {
            if(c == '(') {
                stack.push(c);
            } else {
                if(stack.isEmpty()) return false;
                stack.pop();
            }
        }

        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}