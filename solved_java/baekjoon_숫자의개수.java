package solved;

import java.util.Scanner;

/*
    숫자의 개수
 */
public class baekjoon_숫자의개수 {
    public static void main(String[] args) {
        int a, b, c = 0;
        String[] inputToString;
        int[] answer = new int[10];
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        // String 배열에 계산된 값을 하나씩 요소로 넣어줌
        inputToString = String.valueOf(a * b * c).split("");

        for (int i = 0; i < inputToString.length; i++) {
            // 반복문을 돌면서 각 배열의 값을 int로 형변환 해주고
            int temp = Integer.parseInt(inputToString[i]);
            // casting된 값을 answer 요소의 인덱스로 사용
            // 인덱스에 해당하는 값을 1씩 증가시켜준다.
            answer[temp]++;
        }
        for (int x : answer) {
            System.out.println(x);
        }
    }
}
