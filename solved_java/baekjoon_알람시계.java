package solved;

import java.util.Scanner;

/*
    알람시계
 */
public class baekjoon_알람시계 {
    public static void main(String[] args) {
        int H, M = 0;

        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        M = sc.nextInt();

        if (M >= 45) {
            M -= 45;
        } else {
            H--;
            M += 15;
        }

        if (H < 0) {
            H = 23;
        }
        System.out.println(H + " " + M);
    }
}
