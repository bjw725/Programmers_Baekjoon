class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int cnt1 =0;
        int cnt2 =0;
        for(int i =0; i<num_list.length;i++){
            if(num_list[i]%2 == 0) cnt1 ++;
            else cnt2 ++;
        }
        answer[0] = cnt1;
        answer[1] = cnt2;
        return answer;
    }
}

// 새로운 방법
/*
for(int i =0; i<num_list.length; i++){
    answer[num_list[i]%2]++;
    return answer;
}
*/