package solved;

import java.util.Scanner;

public class baekjoon_거스름돈 {
//    public static void main(String[] args) {
//        int n, ans = 0;
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        n = 1000 - n;
//        while(true) {
//            if(n == 0) {
//                System.out.print(ans);
//                break;
//            }
//            if(n >= 500) {
//                n -= 500;
//                ans++;
//            } else if(n >= 100) {
//                n-=100;
//                ans++;
//            } else if(n >=50) {
//                n-=50;
//                ans++;
//            } else if(n >=10) {
//                n-=10;
//                ans++;
//            }else if( n>= 5) {
//                n -=5;
//                ans++;
//            } else {
//                n-=1;
//                ans++;
//            }
//        }
//    }
public static void main(String[] args) {
    int n, ans = 0;
    int[] change = {500, 100, 50, 10, 5, 1};
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    n = 1000 - n;

    for (int x : change) {
        if (n >= x) {
            ans += n/x;
            n %= x;
        }
    }
    System.out.println(ans);
}

}
