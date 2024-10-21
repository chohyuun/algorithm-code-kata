package algorithm;

// 콜라츠 추측
public class Collarz1021 {
    public int solution(int num) {
        int answer = 0;
        long longNum = num;
        while (longNum != 1) {
            if (longNum % 2 == 0) {
                longNum /= 2;
            } else {
                longNum = longNum * 3 + 1;
            }
            answer++;
            if(answer == 500){
                answer = -1;
                break;
            }
        }
        return answer;
    }
}
