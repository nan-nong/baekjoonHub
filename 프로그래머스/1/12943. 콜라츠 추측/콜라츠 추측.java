class Solution {
    public int solution(long num) {
        int count = 0;

        if (num > 1){
            while (count < 500) {
                if (num % 2 == 0) {
                    num /= 2;
                } else {
                    num = (num * 3) + 1;
                }

                count++;
                if(num == 1) break;
            }
        } else {
            return 0;
        }

        //와우 ... count 488 나온 이유는 스택오버플로우가 일어났기때문이다...............
        return count < 500 ? count : -1;
    }
}