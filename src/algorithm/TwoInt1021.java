package algorithm;
// 두 정수 사이의 합
public class TwoInt1021 {
    public long solution(int a, int b) {
        long answer = 0;
        int maxNum = Math.max(a, b);
        int minNum = Math.min(a, b);
        for(int i = minNum; i <= maxNum; i++) {
            answer += i;
        }
        return answer;
    }
}
