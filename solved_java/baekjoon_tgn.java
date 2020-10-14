package solved;

import java.util.Scanner;

public class baekjoon_tgn {
    public static void main(String[] args) {
        int n, r =0, e=0, c=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i=0; i < n; i++){
            r = sc.nextInt();
            e = sc.nextInt();
            c = sc.nextInt();

            if(e - c > r) {
                System.out.println("advertise");
            }else if(e - c == r) {
                System.out.println("does not matter");
            }else {
                System.out.println("do not advertise");
            }
        }
    }
}
