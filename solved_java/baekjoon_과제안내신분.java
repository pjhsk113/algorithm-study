package solved;

import java.util.Scanner;

public class baekjoon_과제안내신분 {
    public static void main(String[] args) {
        int n =0;
        int[] arr = new int[31];
        Scanner sc = new Scanner(System.in);


        for(int i = 0; i< 28; i++) {
            n = sc.nextInt();
            arr[n] = n;
        }
        for(int i=1;i <31; i++) {
            if(arr[i] == 0) {
                System.out.println(i);
            }
        }
    }
}
