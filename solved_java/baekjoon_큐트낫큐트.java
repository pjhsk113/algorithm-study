package solved;

import java.util.Scanner;

public class baekjoon_큐트낫큐트 {
    public static void main(String[] args) {
        int n,m,cnt =0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=0;i<n;i++) {
            m = sc.nextInt();
            if(m == 1) {
                ++cnt;
            }
        }
        if(cnt > n/2) {
            System.out.println("Junhee is cute!");
        }else{
            System.out.println("Junhee is not cute!");
        }
    }
}
