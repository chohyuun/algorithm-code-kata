package algorithm;

import java.util.*;

// 문자열 내 마음대로 정렬하기
public class StringSort1030 {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        Map<Character, ArrayList<Integer>> map = new TreeMap<>();

        for(int i = 0; i < strings.length; i++) {
            char ch = strings[i].charAt(n);
            ArrayList<Integer> list = new ArrayList<>();


            if(map.containsKey(ch)) {
                list.addAll(map.get(ch));
            }
            list.add(i);
            map.put(ch, list);
        }

        int index = 0;

        for(Character s : map.keySet()) {
            if(map.get(s).size() > 1) {
                String[] sorted = new String[map.get(s).size()];

                for(int i = 0; i < map.get(s).size(); i++) {
                    sorted[i] = strings[map.get(s).get(i)];
                }
                Arrays.sort(sorted);

                for(int j = 0; j < sorted.length; j++) {
                    answer[index++] = sorted[j];
                }
            }else{
                answer[index++] = strings[map.get(s).get(0)];
            }
        }

        return answer;
    }
}
