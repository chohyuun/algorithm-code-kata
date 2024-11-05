package algorithm;

import java.util.Arrays;

public class HOF1105 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] hofList = new int[k];

        for(int i = 0; i < score.length; i++) {
            if(score[i] >= hofList[0]) {
                hofList[0] = score[i];
                Arrays.sort(hofList);
            }
            if(i < k){
                answer[i] = hofList[k-1-i];
            }else{
                answer[i] = hofList[0];
            }
        }

        return answer;
    }
}
