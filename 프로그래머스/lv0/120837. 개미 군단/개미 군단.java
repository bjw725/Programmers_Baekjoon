class Solution {
    public int solution(int hp) {
        int answer = 0;
        int[] numbers = {5,3,1};
        for(int i=0; i<3; i++){
            answer += hp/numbers[i];
            hp = hp%numbers[i];
        }
        return answer;
    }
}