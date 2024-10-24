package algorithm;

import java.util.regex.Pattern;

// 문자열 다루기 기본
public class StringBasic1024 {
    public boolean solution(String s) {
        boolean answer = true;
        final String NUM_REGEX = "[0-9]*";

        if(s.length() == 4 || s.length() == 6) {
            if (!Pattern.matches(NUM_REGEX, s)) {
                answer = false;
            }
        } else {
            answer = false;
        }

        return answer;
    }
}
