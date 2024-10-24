package algorithm;

// 가운데 글자 가져오기
public class MiddleString1024 {
    public String solution(String s) {
        String answer = "";

        if(s.length() % 2 == 1){
            answer = String.valueOf(s.charAt(s.length()/2));
        } else{
            answer = s.substring((s.length()/2) - 1, s.length()/2 + 1);
        }

        return answer;
    }
}
