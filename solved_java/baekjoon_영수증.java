package solved;

import java.util.Scanner;

public class baekjoon_영수증 {
//    public static void main(String[] args) {
//        int total, n, ans = 0;
//        int temp = 0;
//        Scanner sc = new Scanner(System.in);
//
//        total = sc.nextInt();
//
//        for(int i=0;i<9;i++) {
//            n = sc.nextInt();
//            temp += n;
//        }
//        ans = total-temp;
//        System.out.println(ans);
//    }
    public static void main(String[] args) {
        int total, n, ans = 0;

        Scanner sc = new Scanner(System.in);

        total = sc.nextInt();

        for(int i=0;i<9;i++) {
            n = sc.nextInt();
            total -= n;
        }

        System.out.println(total);
    }
}
