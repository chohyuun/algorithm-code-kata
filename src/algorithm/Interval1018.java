package algorithm;

public class Interval1018 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long upNum = x;

        for(int i = 0; i < n; i++) {
            answer[i] = upNum;
            upNum += x;
        }

        return answer;
    }
}
