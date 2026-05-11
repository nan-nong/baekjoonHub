class Solution {
    public int solution(int n) {
        int answer = 0;
        int nBitCnt = Integer.bitCount(n);
        int cnt = 1;
        while(true) {
        	answer = n + cnt++;
        	int answerBitCnt = Integer.bitCount(answer);
        	
        	if(nBitCnt == answerBitCnt) break;
        }
        
        return answer;
    }    
}