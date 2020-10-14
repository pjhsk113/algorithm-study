package solved;

import java.util.Scanner;

public class baekjoon_세로읽기 {
    public static void main(String[] args) {
        String s = null;
        String[] temp = null;
        String[][] ans = new String[5][16];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<5;i++) {
            s = sc.next();
            temp = s.split("");
            for(int j =0;j<temp.length;j++) {
                ans[i][j] = temp[j];
            }
        }

        for(int i=0;i<15;i++) {
            for(int j=0;j<5;j++){
                if(ans[j][i] == null) {
                    continue;
                }
                System.out.print(ans[j][i]);
            }
        }
    }
}
