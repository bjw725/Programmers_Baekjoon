class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        String remo = letter;
        answer = my_string.replace(remo,"");
        return answer;
    }
}