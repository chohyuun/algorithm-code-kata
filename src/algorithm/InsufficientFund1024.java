package algorithm;

// 부족한 금액 계산하기
public class InsufficientFund1024 {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long lastPrice = 0;

        for(int i = 1; i <= count; i++) {
            lastPrice += price * i;
        }

        if(lastPrice > money) {
            answer = lastPrice - money;
        }else{
            answer = 0;
        }

        return answer;
    }
}
