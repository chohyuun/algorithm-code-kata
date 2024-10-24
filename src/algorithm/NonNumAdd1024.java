package algorithm;

import java.util.ArrayList;
import java.util.Arrays;

// 없는 숫자 더하기
public class NonNumAdd1024 {
    public int solution(int[] numbers) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        Arrays.stream(numbers).sorted().forEach((num) -> {
            arr.add(num);
        });

        for (int i = 1; i < 10; i++) {
            if(!arr.contains(i)){
                answer += i;
            }
        }

        System.out.println(arr);

        return answer;
    }
}
