package algorithm;

import java.util.Arrays;

public class Lotto1127 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int answerNum = 0;
        int zeroNum = 0;

        Arrays.sort(lottos);
        Arrays.sort(win_nums);

        for (int i = 0; i < 6; i++) {
            if (lottos[i] == 0) {
                zeroNum++;
                continue;
            }
            for (int j = 0; j < 6; j++) {
                if (lottos[i] == win_nums[j]) {
                    answerNum++;
                    break;
                }
            }
        }

        answer[1] = Math.min((6 - answerNum + 1), 6);
        answer[0] = Math.min((6 - (zeroNum + answerNum) + 1), 6);

        return answer;
    }
}
