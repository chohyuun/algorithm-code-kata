package algorithm;

import java.util.ArrayList;
import java.util.Collections;

// 정수 내림차순으로 배치하기
public class IntDesc1021 {
    public long solution(long n) {
        long answer = 0;
        ArrayList<Integer> list = new ArrayList<>();

        while (n > 0) {
            list.add((int) (n % 10));
            n /= 10;
        }

        list.sort(Collections.reverseOrder());

        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i);
            if(i == list.size()-1){
                break;
            }
            answer *= 10;
        }
        return answer;
    }
}
