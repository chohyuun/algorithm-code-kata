package algorithm;

// 숫자 문자열과 영단어
public class IntToString1029 {
    public int solution(String s) {
        int answer = 0;
        String st = "";
        String[] numberString = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        StringBuilder answerString = new StringBuilder();


        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= '0' && ch <= '9') {
                answerString.append(ch);
            } else {
                st += ch;


                for(int j = 0; j < numberString.length; j++){
                    if(numberString[j].equals(st)){
                        answerString.append(j);
                        st = "";
                        break;
                    }
                }
            }
        }

        answer = Integer.parseInt(answerString.toString());

        return answer;
    }
}
