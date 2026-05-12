class Solution {
    public int solution(int n) {
        int count = 0;

        for (int i = 1; i <= n ; i++){
            int answer = 0;
            int j = i;

            // i+1, i+2, i+3.. 연속된 숫자를 더해서 만약 해당 숫자가 동일하다면 break;하고 count증가
            while(true){
                answer += j;
                j += 1;
                if(answer == n){
                    count++;
                    break;
                } else if (answer > n){
                    break;
                }
            }
        }
        return count;
    }
}