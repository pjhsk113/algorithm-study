package solved;

import java.util.Scanner;

public class baekjoon_직각삼각형 {
//    public static void main(String[] args) {
//        int a, b, c = 0;
//        String answer = null;
//        Scanner sc = new Scanner(System.in);
//        while(true) {
//            a = sc.nextInt();
//            b = sc.nextInt();
//            c = sc.nextInt();
//
//            if((a + b + c) == 0) {
//                break;
//            }
//            if((a*a) + (b*b) == (c*c)) {
//                answer = "right";
//            } else if((c*c) + (b*b) == (a*a)){
//                answer = "right";
//            } else if((a*a) + (c*c) == (b*b)){
//                answer = "right";
//            } else {
//                answer = "wrong";
//            }
//            System.out.println(answer);
//        }
//    }
    public static void main(String[] args) {
        int a, b, c = 0;
        String answer = null;
        Scanner sc = new Scanner(System.in);
        while(true) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            if((a + b + c) == 0) {
                break;
            }
            answer = (a*a) + (b*b) == (c*c) ||
                    (c*c) + (b*b) == (a*a) ||
                    (a*a) + (c*c) == (b*b)
                    ? "right": "wrong";
            System.out.println(answer);
        }
    }
}
