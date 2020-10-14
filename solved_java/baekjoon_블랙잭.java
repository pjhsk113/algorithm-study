package solved;

import java.util.Scanner;

public class baekjoon_블랙잭 {
//    /*
//        백트래킹으로 조합구함
//     */
//    static int answer = 0;
//    public static void main(String[] args) {
//        int n, m = 0;
//        Scanner sc = new Scanner(System.in);
//
//        n = sc.nextInt();
//        m = sc.nextInt();
//        int[] arr = new int[n];
//        boolean[] visited = new boolean[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        combination(arr, visited, 0, n, 3, m);
//        System.out.println(answer);
//    }
//    static void combination(int[] arr, boolean[] visited, int start, int n, int r, int m) {
//        if (r == 0) {
//            int max = 0;
//            for (int i = 0; i < n; i++) {
//                if (visited[i]) {
//                    max += arr[i];
//                }
//            }
//            if(answer < max && max <= m) {
//                answer = max;
//            }
//            return ;
//        }
//
//        for (int i = start; i < n; i++) {
//            visited[i] = true;
//            combination(arr, visited, i + 1, n, r - 1, m);
//            visited[i] = false;
//        }
//    }


/*
    3중 for문
 */
    public static void main(String[] args) {
        int n, m = 0;
        int max, answer = 0;

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            for(int j=i+1; j<n; j++) {
                for(int k=j+1; k<n; k++) {
                    max = arr[i] + arr[j] + arr[k];
                    if (max > answer && max <= m) {
                        answer = max;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
