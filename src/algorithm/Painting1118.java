package algorithm;

public class Painting1118 {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int sum = 0;

        for (int sec : section) {
            if (sum < sec) {
                sum = sec + m - 1;
                answer++;
            }
        }

        return answer;
    }
}
