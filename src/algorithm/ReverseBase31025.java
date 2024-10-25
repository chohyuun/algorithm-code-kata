package algorithm;
import java.util.Stack;

// 3진법 뒤집기
public class ReverseBase31025 {
    public int solution(int n) {
        int answer = 0;
        Stack<Integer> list = new Stack<>();

        for(int i = n; i > 0; i /= 3) {
            list.add(i % 3);
        }

        for(int i = 0; !list.empty(); i++) {
            answer += (int) (list.pop() * Math.pow(3, i));
        }

        return answer;
    }
}
