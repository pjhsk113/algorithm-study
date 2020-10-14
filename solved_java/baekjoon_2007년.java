package solved;

import java.util.Scanner;

/*
    2007년
 */
public class baekjoon_2007년 {
    public static void main(String[] args) {
        int x, y = 0;
        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();
        // 입력받은 이전달까지의 일수를 구함
        for (int i = 0; i < x - 1; i++) {
            y += month[i];
        }
        y = y%7;
        System.out.println(week[y]);
    }
}
