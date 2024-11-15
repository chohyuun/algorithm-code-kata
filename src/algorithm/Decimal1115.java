package algorithm;

import java.util.ArrayList;

// 소수 만들기
public class Decimal1115 {
    public int solution(int[] nums) {
        int answer = 0;

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                for(int k = j+1; k < nums.length; k++) {
                    list.add(nums[i]+nums[j]+nums[k]);
                }
            }
        }

        for(int i = 0; i < list.size(); i++) {
            boolean isDecimal = true;
            for(int j = 2; j < list.get(i); j++) {
                if(list.get(i) % j == 0){
                    isDecimal = false;
                }
            }
            if(isDecimal) {
                answer++;
            }
        }

        return answer;
    }
}
