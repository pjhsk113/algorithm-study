package solved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class baekjoon_올림픽 {
    public static void main(String[] args) {
        int n, k;
        int cnt = 0;
        int[][] country = new int[1000][4];
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();

        country = new int[1000][4];
        for (int i = 0; i < n; i++) {
            for(int j = 0 ; j< 4; j++) {
                int number = sc.nextInt();
                country[i][j] = number;
            }
        }
        Arrays.sort(country, (o1,o2) -> {
            if (o1[1] == o2[1]) {
                return Integer.compare(o1[2], o2[2]);
            } else {
                return Integer.compare(o1[3], o2[3]);
            }
        });
        for (int i = 0; i < n; i++) {
            for(int j = 0 ; j< 4; j++) {
                System.out.print(country[i][j]);
            }
            System.out.println();
        }
    }
}
