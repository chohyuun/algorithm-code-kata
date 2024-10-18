package algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class Reverse1018 {
    public int[] solution(long n) {
        int[] answer = {};
        Queue<Long> queue = new LinkedList<>();

        while (n > 0) {
            queue.add(n % 10);
            n /= 10;
        }

        answer = new int[queue.size()];
        int count = queue.size();

        for(int i = 0; i < count; i++) {
            answer[i] = Math.toIntExact(queue.poll());
        }
        return answer;
    }
}
