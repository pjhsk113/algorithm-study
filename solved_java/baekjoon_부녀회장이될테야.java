package sovled_20201013;

import java.util.Scanner;

public class baekjoon_부녀회장이될테야 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[15][15];
        int temp = 0;

        for (int i=0;i<=14;i++) {
            arr[0][i] = i;
        }
        for (int i=1;i<=14;i++) {
            for(int j=1;j<=14;j++) {
                temp = temp + arr[i-1][j];
                arr[i][j] = temp;
            }
            temp = 0;
        }

        int n=0,k=0,t=0;
        t = sc.nextInt();
        for (int i=0;i<t;i++) {
            k = sc.nextInt();
            n = sc.nextInt();
            System.out.println(arr[k][n]);
        }
    }
}