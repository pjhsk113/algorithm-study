package solved;

import java.util.Scanner;

public class baekjoon_심부름가는길 {
    public static void main(String[] args) {
        int x, y;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i =0; i<4;i++) {
            sum += sc.nextInt();
        }
        x = sum / 60;
        y = sum % 60;
        System.out.println(x);
        System.out.println(y);
    }
}
