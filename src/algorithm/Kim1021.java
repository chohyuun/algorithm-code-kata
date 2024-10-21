package algorithm;

import java.util.ArrayList;
import java.util.Arrays;

// 서울에서 김서방 찾기
public class Kim1021 {
    public String solution(String[] seoul) {
        String answer = "";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(seoul));
        answer = "김서방은 " + list.indexOf("Kim") + "에 있다";
        return answer;
    }
}
