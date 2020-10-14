package solved;

import java.util.Scanner;

public class baekjoon_방학숙제 {
    public static void main(String[] args) {
        int totalVacation, totalMath, totalKorean;
        int limitMathSolve, limitKoreanSolve;
        int ans = 0;
        Scanner sc = new Scanner(System.in);

        totalVacation = sc.nextInt();   // 방학일수
        totalKorean = sc.nextInt();     // 총 풀어야할 국어 페이지
        totalMath = sc.nextInt();       // 총 풀어야할 수학 페이지
        limitKoreanSolve = sc.nextInt();// 하루에 풀수있는 국어 페이지
        limitMathSolve = sc.nextInt();  // 하루에 풀수있는 수학 페이지

        while(true) {
            if(0 >= totalMath && 0 >= totalKorean) {
                break;
            }
            totalMath -= limitMathSolve;
            totalKorean -= limitKoreanSolve;
            ++ans;
        }
        System.out.println(totalVacation-ans);
    }
}
