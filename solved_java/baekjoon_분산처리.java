package solved;

import java.math.BigInteger;
import java.util.Scanner;

public class baekjoon_분산처리 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a;
        int b;
        int answer = 0;
        int pow = 0;
        for (int i=0;i<t;i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            for (int j = 0; j< b; j++) {
                a = a * a;
                pow = a * a;
                answer = pow % 10;
            }
            if (answer == 0) {
                System.out.println(10);
            }else {
                System.out.println(answer);
            }
        }
    }
}
