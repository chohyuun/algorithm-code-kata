package algorithm;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

// 제일 작은 수 제거하기
public class RemoveMinNum1024 {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length == 1 ? 1 : arr.length - 1];
        AtomicInteger min = new AtomicInteger(arr[0]);
        int index = 0;

        Arrays.stream(arr).forEach((num) -> {
            if (num < min.get()) {
                min.set(num);
            }
        });

        if (arr.length == 1) {
            answer[0] = -1;
        } else {
            for (int i : arr) {
                if (i != min.get()) {
                    answer[index++] = i;
                }
            }
        }

        return answer;
    }
}
