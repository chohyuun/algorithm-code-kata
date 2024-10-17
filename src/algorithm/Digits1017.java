package algorithm;

public class Digits1017 {
    public int solution(int n) {
        int answer = 0;
        int number = n;

        while(number > 0){
            answer += number % 10;
            number /= 10;
        }

        return answer;
    }
}
