package algorithm;

// 최대공약수와 최소공배수
public class GcdLcm1025 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int gcd = 0;
        int mul = 1;
        int max = Math.max(n, m);

        // GCD
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && m % i == 0 && gcd < i) {
                gcd = i;
            }

        }

        answer[0] = gcd;

        // LCM
        for (int i = 1; i <= max; i++) {
            for (int j = 1; j <= max; j++) {
                if (n * i == m * j) {
                    mul = n * i;
                    break;
                }
            }
            if (mul != 1) {
                answer[1] = mul;
                break;
            }
        }
        return answer;
    }
}
