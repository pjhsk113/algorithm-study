package solved;

import java.util.Scanner;

public class baekjoon_색종이 {
    public static void main(String[] args) {
        boolean[][] map = new boolean[101][101];
        int n = 0;
        int x, y, cnt = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i=0;i<n;i++) {
            x = sc.nextInt();
            y = sc.nextInt();

            for(int j=y-1; j<y+9;j++) {
                for(int k=x-1; k<x+9; k++) {
                    map[j][k] = true;
                }
            }
        }
        for(int i=0;i<101;i++) {
            for(int j=0;j<101;j++) {
                if(map[i][j] == true){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
