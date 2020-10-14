package solved;

import java.util.Scanner;

public class baekjoon_택시기하학 {
    public static void main(String[] args) {
        double PI = Math.PI;
        int n = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        System.out.printf("%.6f\n", n*n*PI);
        System.out.printf("%.6f", n*n*2.0);
    }
}
