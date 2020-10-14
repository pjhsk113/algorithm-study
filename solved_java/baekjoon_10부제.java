package solved;

import java.util.Scanner;

public class baekjoon_10부제 {
    public static void main(String[] args) {
        int n, car, ans = 0;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        n = n % 10;

        for(int i = 0; i < 5; i++) {
            car = sc.nextInt();
            if(n == car) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
