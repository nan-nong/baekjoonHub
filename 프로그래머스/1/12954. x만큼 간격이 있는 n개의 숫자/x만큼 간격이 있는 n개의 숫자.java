class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        // n지니는 리스트 리턴
        long num = x;
        
        // answer길이만큼 돌려서 더하기
        for(int i = 0; i < answer.length; i++){
            answer[i] = num;
            num += x;
        }
        return answer;
    }
}