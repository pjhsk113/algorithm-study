package solved;

import java.util.Scanner;

public class baekjoon_팩토리얼 {
    public static void main(String[] args) {
        int n =1;
        int answer = 1;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            answer *= i ;
        }
        System.out.println(answer);
    }
}
