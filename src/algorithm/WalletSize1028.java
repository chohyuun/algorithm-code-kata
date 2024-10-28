package algorithm;

import java.util.Arrays;

// 최소직사각형
public class WalletSize1028 {
    public int solution(int[][] sizes) {
        int[] w = new int[sizes.length];
        int[] h = new int[sizes.length];
        int hMax = 0;
        int wMax = 0;

        for(int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] < sizes[i][1]){
                w[i] = sizes[i][1];
                h[i] = sizes[i][0];
            }else{
                w[i] = sizes[i][0];
                h[i] = sizes[i][1];
            }
        }

        wMax = Arrays.stream(w).max().getAsInt();
        hMax = Arrays.stream(h).max().getAsInt();


        return wMax * hMax;
    }
}
