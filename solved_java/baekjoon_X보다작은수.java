package solved;

import java.util.Scanner;

/*
    X보다 작은 수
 */
public class baekjoon_X보다작은수 {
    public static void main(String[] args) {
        int n, number, x;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        x = sc.nextInt();

        for (int i=0; i<n; i++) {
            number = sc.nextInt();
            if (number < x) {
                System.out.print(number + " ");
            }
        }
    }
}
