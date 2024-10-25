package algorithm;

// 이상한 문자 만들기
public class StrangeString1025 {
    public String solution(String s) {
        String answer = "";
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                answer += s.charAt(i);
                index = 0;
            } else {
                if (index % 2 == 0) {
                    answer += Character.toUpperCase(s.charAt(i));
                } else {
                    answer += Character.toLowerCase(s.charAt(i));
                }
                index++;
            }
        }

        return answer;
    }
}
