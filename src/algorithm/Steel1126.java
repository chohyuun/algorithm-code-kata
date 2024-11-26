package algorithm;

public class Steel1126 {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] medicinal = new int[number];
        boolean del = false;

        medicinal[0] = 1;

        if(number > 2){
            medicinal[1] = 2;
        }

        for (int i = 3; i <= number; i++) {
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if(i % j == 0) {
                    medicinal[i - 1]++;
                    if((double) i / 2 == Math.sqrt(i) && i % 2 == 0 || j == Math.sqrt(i)) {
                        del = true;
                    }
                }
            }
            medicinal[i - 1] *= 2;
            if(del) {
                medicinal[i - 1]--;
                del = false;
            }
        }

        for(int i = 0; i < number; i++) {
            System.out.println(medicinal[i]);
            if(medicinal[i] > limit) {
                answer += power;
            }else{
                answer += medicinal[i];
            }
        }

        return answer;
    }
}
