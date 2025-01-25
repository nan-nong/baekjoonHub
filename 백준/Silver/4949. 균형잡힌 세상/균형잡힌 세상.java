import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            boolean flag = true;        // 탐색 참/거짓
            String str = br.readLine();
            Stack<Character> st = new Stack<>();

            if(str.equals(".")) {
                break;
            }

            for(int i = 0 ; i < str.length() ; i++){
                char ch = str.charAt(i);
                if (ch == '(' || ch == '[') {
                    st.add(ch);
                } else if (ch == ')'){
                    if(st.isEmpty() || st.peek() != '('){
                        flag = false;
                        break;
                    } else if (st.peek() == '(') {
                        st.pop();
                    }
                } else if(ch == ']') {
                    if(st.isEmpty() || st.peek() != '['){
                        flag = false;
                        break;
                    } else if (st.peek() == '[') {
                        st.pop();
                    }
                }

            }
            if(st.isEmpty() && flag) {
                sb.append("yes").append("\n");
            } else if(!st.isEmpty() || !flag) {
                sb.append("no").append("\n");
            }
        }
        System.out.println(sb.toString());
        br.close();
    }
}
