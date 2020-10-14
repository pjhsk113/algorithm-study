package solved;

import java.util.Scanner;

public class baekjoon_수이어쓰기 {
//    public static void main(String[] args) {
//        int n, ans = 0, cnt = 0, temp = 1;
//        int countNumber = 9;
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        cnt = (int)Math.floor(Math.log10(n)+1);
//
//        for(int i =1; i<=cnt-1; i++) {
//            ans += countNumber * i;
//            countNumber*=10;
//        }
//        for(int i =0; i<cnt-1; i++) {
//            temp *= 10;
//        }
//        n -= temp;
//        ans += (n+1) * cnt;
//        System.out.println(ans);
//    }
    public static void main(String[] args) {
        int n, ans = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i=1; i<=n; i*=10) {
            ans += (n-i) +1;
        }
        System.out.println(ans);
    }
}
