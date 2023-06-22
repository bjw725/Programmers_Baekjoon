class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if(direction.equals("left")){
            for(int i = 0; i < numbers.length-1; i++){
                answer[i] = numbers[i+1];
            }
            answer[numbers.length-1] = numbers[0];
        }
        else{
            for(int j = 0; j < numbers.length-1; j++){
                answer[j+1] = numbers[j];
            }
            answer[0] = numbers[numbers.length-1];
        }
        return answer;
    }
}