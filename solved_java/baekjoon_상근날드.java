package solved;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon_상근날드 {
    public static void main(String[] args) {
        int[] hamberger = new int[3];
        int[] drink = new int[2];
        int answer = 0;
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 3; i++) {
            hamberger[i] = sc.nextInt();
        }
        for (int i = 0; i < 2; i++) {
            drink[i] = sc.nextInt();
        }
        Arrays.sort(hamberger);
        Arrays.sort(drink);
        System.out.println(hamberger[0] + drink[0] - 50);
    }
}
