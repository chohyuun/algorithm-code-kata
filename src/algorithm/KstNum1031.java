package algorithm;

import java.util.ArrayList;

public class KstNum1031 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < commands.length; i++){
            for(int j = commands[i][0] - 1; j < commands[i][1]; j++){
                list.add(array[j]);
            }
            list.sort(Integer::compareTo);
            answer[i] = list.get(commands[i][2]-1);
            list.clear();
        }

        return answer;
    }
}
