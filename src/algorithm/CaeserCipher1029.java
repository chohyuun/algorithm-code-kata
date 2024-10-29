package algorithm;

// 시저 암호
public class CaeserCipher1029 {
    public String solution(String s, int n) {
        String answer = "";
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] <= 'z' && chars[i] >= 'a') {
                if (chars[i] + n > 'z') {
                    chars[i] = (char) (chars[i] - 26 + n);
                } else {
                    chars[i] = (char) (chars[i] + n);
                }
            } else if (chars[i] <= 'Z' && chars[i] >= 'A') {
                if (chars[i] + n > 'Z') {
                    chars[i] = (char) (chars[i] - 26 + n);
                } else {
                    chars[i] = (char) (chars[i] + n);
                }
            }
            answer += chars[i];
        }

        return answer;
    }
}
