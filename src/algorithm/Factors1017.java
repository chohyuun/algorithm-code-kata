package algorithm;

public class Factors1017 {
    public int solution(int n) {
        int answer = 0;

        if (n != 1) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    answer += i;
                }
            }
        } else {
            answer = 1;
        }

        return answer;
    }
}
