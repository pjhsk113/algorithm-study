package solved;

import java.util.Scanner;

public class baekjoon_윷놀이 {
        public static void main(String[] args) {
        String[] result = {"A", "B", "C", "D", "E"};
        int n, cnt = 0;
        Scanner sc = new Scanner(System.in);

        for(int i=0; i < 3; i++) {
            for(int j=0; j<4; j++) {
                n = sc.nextInt();
                if(n == 0) {
                    cnt++;
                }
            }
            if(cnt != 0) {
                System.out.println(result[cnt-1]);
            }else {
                System.out.println(result[4]);
            }

            cnt =0;
        }
    }
//    public static void main(String[] args) {
//        int cnt = 0;
//        int[][] arr = new int[3][4];
//
//        Scanner sc = new Scanner(System.in);
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 4; j++) {
//                arr[i][j] = sc.nextInt();
//                if (arr[i][j] == 0) {
//                    cnt++;
//                }
//            }
//            if (cnt == 0) {
//                System.out.println("E");
//            } else if (cnt == 1) {
//                System.out.println("A");
//            } else if (cnt == 2) {
//                System.out.println("B");
//            } else if (cnt == 3) {
//                System.out.println("C");
//            } else {
//                System.out.println("D");
//            }
//            cnt = 0;
//        }
//    }
}
