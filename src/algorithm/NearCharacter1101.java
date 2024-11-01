package algorithm;

import java.util.ArrayList;

// 가장 가까운 글자
public class NearCharacter1101 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        ArrayList<Character> list = new ArrayList<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            list.add(c);
            if(list.contains(c) && list.indexOf(c) != i){
                int index = 0;
                for(int j = list.size() - 2; j >= 0; j--){
                    if(list.get(j) == c){
                        index = i - j;
                        break;
                    }
                }
                answer[i] = index;
            }else{
                answer[i] = -1;
            }
        }
        return answer;
    }
}
