package solved;

import java.util.Scanner;

public class baekjoon_더하기사이클 {
    public static void main(String[] args) {
        int n = 0, sum = 0, temp = 0, clone = 0, cnt = 0;
        int first, second;
        int sumFirst, sumSecond;
        int[] arr1 = new int[2];
        int[] arr2 = new int[2];

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        clone = n;
        while(true) {
           first = clone  / 10;
           second = clone  % 10;
           sum = first + second;
           sumFirst = sum  / 10;
           sumSecond = sum  % 10;

           arr1[0] = first;
           arr1[1] = second;
           arr2[0] = sumFirst;
           arr2[1] = sumSecond;

           temp = arr1[1]*10 + arr2[1];
           clone = temp;
           if (temp != n) {
               cnt++;
           }else {
               cnt++;
               break;
           }
       }
        System.out.println(cnt);
    }
}
