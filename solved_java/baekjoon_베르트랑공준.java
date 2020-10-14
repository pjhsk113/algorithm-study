package solved;

import java.util.Scanner;

/*
    에라토스테네스의 체
 */
public class baekjoon_베르트랑공준 {
    public static void main(String[] args) {
        int from, to, ans = 0;
        int max = 123456 * 2;
        boolean[] prime = new boolean[max + 1];
        prime[0] = prime[1] = true;
        Scanner sc = new Scanner(System.in);

        while(true) {
            from = sc.nextInt();
            if (from == 0) {
                break;
            }
            to = from * 2;
            ans = 0;

            for(int i=2; i*i <= max; i++) {
                if (prime[i] == true) {
                    continue;
                }
                for(int j= i+i; j <= max; j+=i) {
                    prime[j] = true;
                }
            }

            for(int i=from+1; i <=to; i++) {
                if(prime[i] == false) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
