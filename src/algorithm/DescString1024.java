package algorithm;

// 문자열 내림차순으로 배치하기
public class DescString1024 {
    public String solution(String s) {
        String answer = "";

        char[] charArr = s.toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            for (int j = i + 1; j < charArr.length; j++) {
                char temp = ' ';
                if(charArr[i] < charArr[j]){
                    temp = charArr[i];
                    charArr[i] = charArr[j];
                    charArr[j] = temp;
                }
            }
        }

        answer = new String(charArr);

        return answer;
    }
}
