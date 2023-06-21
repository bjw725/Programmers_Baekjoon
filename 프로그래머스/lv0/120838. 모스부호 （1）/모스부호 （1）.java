class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."
            };
        String[] alp = new String[26];
        alp = letter.split(" ");
        for(String s : alp){
            for(int i=0; i<morse.length; i++){
                if(s.equals(morse[i])) answer += Character.toString(i + 'a');
            }
        }
        return answer;
    }
}