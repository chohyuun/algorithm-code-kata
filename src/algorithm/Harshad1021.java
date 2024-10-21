package algorithm;

// 하샤드 수
public class Harshad1021 {
    public boolean solution(int x) {
        boolean answer = true;
        int i = 0;
        int num = x;
        while (num > 0) {
            i += num % 10;
            num /= 10;
        }
        answer = x % i == 0;
        return answer;
    }
}
