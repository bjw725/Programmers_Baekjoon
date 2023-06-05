import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        int length = array.length;
        if(length % 2 != 0){
            answer = array[length/2];
        }
        return answer;
    }
}