class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int cnt = 0;
        for(int i = 1; i < k; i++){
            cnt += 2;
        }
        cnt %= numbers.length;
        answer = numbers[cnt];
        return answer;
    }
}