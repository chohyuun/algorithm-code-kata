package algorithm;

// 수박수박수박수박수박수?
public class PrintWatermelon1024 {
    public String solution(int n) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                answer += "박";
            } else {
                answer += "수";
            }
        }

        return answer;
    }
}
