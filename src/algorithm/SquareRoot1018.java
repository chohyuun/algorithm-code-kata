package algorithm;

public class SquareRoot1018 {
    public long solution(long n) {
        long answer = 0;
        if (n != 1) {
            for (int i = 1; i < n / 2; i++) {
                if ((long) i * i == n) {
                    answer = (long) (i + 1) * (i + 1);
                    break;
                }
            }
        } else {
            answer = 4;
        }
        if (answer == 0) {
            answer = -1;
        }
        return answer;
    }
}
