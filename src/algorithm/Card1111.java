package algorithm;

// 카드 뭉치
public class Card1111 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int cards2Index = 0;
        int card1Index = 0;
        int checkSame = 0;

        for (int i = 0; i < goal.length; i++) {
            if (card1Index < cards1.length && cards1[card1Index].equals(goal[i])) {
                card1Index++;
                checkSame = 1;
                continue;
            }
            if (cards2Index < cards2.length && cards2[cards2Index].equals(goal[i])) {
                cards2Index++;
                checkSame = 1;
                continue;
            }
            checkSame = 0;
            break;
        }

        if(checkSame == 1){
            answer = "Yes";
        }else{
            answer = "No";
        }

        return answer;
    }
}
