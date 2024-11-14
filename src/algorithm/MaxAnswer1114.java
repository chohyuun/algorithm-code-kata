package algorithm;

import java.util.ArrayList;
import java.util.Arrays;

// 모의고사
public class MaxAnswer1114 {
    public int[] solution(int[] answers) {
        ArrayList<Integer> answerList = new ArrayList<>();
        int[] answerCount = new int[3];

        int[][] a = {{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
        int[] index = {0, 0, 0};

        for(int i = 0; i < answers.length; i++) {
            for(int j = 0; j < 3; j++) {
                if(index[j] >= a[j].length){
                    index[j] = 0;
                }
                if(a[j][index[j]] == answers[i]){
                    answerCount[j]++;
                }
                index[j]++;
            }
        }

        for(int i =0; i< 3; i++){
            if(Arrays.stream(answerCount).max().getAsInt() == answerCount[i]){
                answerList.add(i + 1);
            }
        }

        int[] answer = answerList.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}
