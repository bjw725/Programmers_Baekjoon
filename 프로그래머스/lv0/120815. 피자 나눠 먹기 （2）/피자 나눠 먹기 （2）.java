class Solution {
    public int solution(int n) {
        int answer = 0;
        int p = 6;
        while(true){
            if(p % n == 0){
                answer = p/6;
                break;
            }
            else p += 6;
        }
        return answer;
    }
}