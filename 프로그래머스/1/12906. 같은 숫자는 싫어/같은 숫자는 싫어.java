import java.util.Arrays;
import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        // int[] answer = {};
//         Stack<Integer> stack = new Stack<>();
//         stack.push(arr[0]);
        
//         for(int arrs : arr) {
//             if(stack.peek() != arrs) {
//                 stack.push(arrs);
//             }
//         }
        // stack을 배열로
        // 효율성에서 대차게 실패~~~~~~~~~~~~~~~
        // answer = new int[stack.size()];
        // int k = stack.size() - 1;
        // while (!stack.isEmpty()){
        //     answer[k--] = stack.pop();
        // }
        // return answer;
        List<Integer> list = new ArrayList<>();

        list.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                list.add(arr[i]);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}