package sovled_20201013;

import java.util.Scanner;

public class baekjoon_피보나치수5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int[] pibo = new int[21];
        pibo[0] = 0;
        pibo[1] = 1;
        for (int i=2;i<=20;i++) {
            pibo[i] = pibo[i-1] + pibo[i-2];
        }
        n = sc.nextInt();
        System.out.print(pibo[n]);
    }
}
