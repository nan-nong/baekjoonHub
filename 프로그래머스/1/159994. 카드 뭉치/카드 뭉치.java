class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < goal.length; i++) {
            if (x < cards1.length && goal[i].equals(cards1[x])) {
                x++;
            } else if (y < cards2.length && goal[i].equals(cards2[y])) {
                y++;
            }
        }

        String answer = (x + y) == goal.length ? "Yes" : "No";
        return answer;
    }
}