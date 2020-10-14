package solved;

import java.util.Scanner;

public class baekjoon_평균점수 {
    public static void main(String[] args) {
        int n, answer = 0;

        Scanner sc = new Scanner(System.in);

        for (int i=0; i<5; i++) {
            n = sc.nextInt();
            if (n < 40) {
                answer += 40;
                continue;
            }
            answer += n;
        }
        System.out.println(answer/5);
    }
}
