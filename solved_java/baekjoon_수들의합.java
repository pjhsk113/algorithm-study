package solved;

import java.util.Scanner;

public class baekjoon_수들의합 {
//    public static void main(String[] args) {
//        Long s, sum=0L;
//        int i=1;
//        Scanner sc = new Scanner(System.in);
//
//        s = sc.nextLong();
//
//        while(true) {
//            sum += i;
//            if( sum > s) {
//                break;
//            }
//            ++i;
//        }
//        System.out.println(i-1);
//    }
    public static void main(String[] args) {
        Long s;
        Long i=1L;
        Scanner sc = new Scanner(System.in);

        s = sc.nextLong();

        while(true) {
            if( i*(i+1)/ 2L > s) {
                break;
            }
            ++i;
        }
        System.out.println(i-1);
    }
}
