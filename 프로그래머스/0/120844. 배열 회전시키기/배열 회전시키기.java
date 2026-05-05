class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        if (direction.equals("right")) {
            // right일 때, 배열 +1씩 증가하여 도달, length 길이와 동일 한것을 0번째로
            for (int i = 0; i < numbers.length; i++) {
                if(i == numbers.length - 1){
                    answer[0] = numbers[numbers.length - 1];
                    break;
                } else {
                    answer[i + 1] = numbers[i];
                }
            }
        } else {
            // left일 때,
            for (int i = numbers.length - 1; i >= 0; i--) {
                if(i == 0){
                    answer[numbers.length - 1] = numbers[0];
                    break;
                } else {
                    answer[i - 1] = numbers[i];
                }
            }
        }
        return answer;
    }
}