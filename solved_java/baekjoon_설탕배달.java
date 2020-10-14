package solved;

import java.util.Scanner;

/*
    설탕 배달
 */
public class baekjoon_설탕배달 {
    public static void main(String[] args) {
        int n, answer = 0;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while(true) {
            // 만약 n이 5의 배수라면 answer에 5로 나눈 몫을 더한다.
            if (n % 5 == 0) {
                answer += n/5;
                break;
            }
            // n이 3보다 작아지는 시점, 즉 2이하일 때
            // 3과 5로 나누어 떨어지지 않는 수로 판단
            if (n < 3) {
                answer = -1;
                break;
            }
            // 5킬로그램 자루로 최대한 많이 가져가는게 최적해이기 때문에
            // n에서 3을 빼면서 5의 배수에 해당되는지를 무한 루프로 검사한다.
            n -= 3;
            answer += 1;
        }
        System.out.println(answer);
    }
}
