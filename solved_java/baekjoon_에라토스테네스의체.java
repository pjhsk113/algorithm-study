package solved;

import java.util.Scanner;

public class baekjoon_에라토스테네스의체 {
    public static void main(String[] args) {
        int n, m, cnt = 0;
        int ans = 0;
        int[] prime = new int[1001];
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for(int i=0;i<=n;i++) {
            prime[i] = i;
        }

        prime[0] = prime[1] = 0;
        for(int i=2; i*i <= n; i++) {
            for(int j=i; j<= n; j+=i) {
                if(prime[j] == 0) {
                    continue;
                }
                ++cnt;
                prime[j] = 0;
                if(cnt == m) {
                    ans = j;
                    System.out.println(ans);
                    break;
                }
            }
        }
        if(cnt != m) {
            for(int i=0;i<=n;i++) {
                if(prime[i] != 0) {
                    ++cnt;
                    if(cnt == m) {
                        ans = i;
                        System.out.println(ans);
                    }
                }
            }
        }
    }
}
