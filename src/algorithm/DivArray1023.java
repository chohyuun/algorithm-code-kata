package algorithm;

import java.util.ArrayList;
import java.util.Arrays;

// 나누어 떨어지는 숫자
public class DivArray1023 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;

        for (int j : arr) {
            if (j % divisor == 0) {
                list.add(j);
            }
        }

        answer = new int[list.isEmpty() ? 1 : list.size()];

        for(int i : list) {
            answer[count++] = i;
        }


        if(list.isEmpty()) {
            answer[0] = -1;
        }else{
            answer = Arrays.stream(answer).sorted().toArray();
        }

        return answer;
    }
}
