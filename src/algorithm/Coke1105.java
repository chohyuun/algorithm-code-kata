package algorithm;

public class Coke1105 {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int remain = 0;

        for(int i = n; i > 0; i = (i / a) * b){
            i += remain;
            answer += i / a * b;
            remain = i % a;
        }

        return answer;
    }
}
