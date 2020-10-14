package solved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class baekjoon_점수계산 {
    public static void main(String[] args) {
        Integer[] totalRank = new Integer[8];
        int[] index = new int[5];
        ArrayList<Integer> clone = new ArrayList<>();
        int ans = 0;
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<8;i++) {
            totalRank[i] = sc.nextInt();
            clone.add(totalRank[i]);
        }
        Arrays.sort(totalRank, Collections.reverseOrder());
        for(int i=0;i<5;i++) {
            ans += totalRank[i];
            index[i] = clone.indexOf(totalRank[i])+1;
        }
        System.out.println(ans);
        Arrays.sort(index);
        for(int i=0;i<5;i++) {
            System.out.print(index[i] + " ");
        }
    }
}
