import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        // ArrayList로 만들어서 add?
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // peak와 넣을 값이 똑같다면 pop 아니면 push
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}