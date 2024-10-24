package algorithm;

// 약수의 개수와 덧셈
public class AddCountDivisor1024 {
    public int solution(int left, int right) {
        int answer = 0;
        int count = 0;

        for (int i = 1; left <= right; i++) {
            if (i <= left) {
                if (left % i == 0) {
                    count++;
                }
            } else {
                if (count % 2 == 0) {
                    answer += left;
                } else {
                    answer -= left;
                }
                left++;
                i = 0;
                count = 0;
            }
        }

        return answer;
    }
}
