# 문제
- 백준 2839 설탕배달
- https://www.acmicpc.net/problem/2839

# 풀이

문제에서 요구하는 것은 설탕을 `정확하게` `최소한`으로 가져갈 수 있는 봉지의 수이다.<br/>
그렇다면 3Kg봉지와 5Kg봉지 중 5Kg봉지를 가장 많이 쓰는 것이 최적해가 될 것이다.<br/>
이 문제는 접근 방법에 따라 쉬울수도 어려울수도 있는 문제인 것 같다.<br/>
예를들면, N킬로그램을 구하기 위해 더하는 방법으로 접근한다면<br/>
경우의 수가 굉장히 많아져서 최적해를 찾아내기 어려워진다.<br/><br/>

접근방법으로 N킬로그램부터 3Kg씩 빼면서 5Kg의 배수를 찾아내면 굉장히 쉽게 풀린다.<br/>



# 코드

```java
import java.util.Scanner;

/*
    설탕 배달
 */
public class baekjoon_설탕배달 {
    public static void main(String[] args) {
        int n, answer = 0;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while(true) {
            // 만약 n이 5의 배수라면 answer에 5로 나눈 몫을 더하고 종료.
            if (n % 5 == 0) {
                answer += n/5;
                break;
            }
            // n이 3보다 작아지는 시점, 즉 2이하일 때
            // 3과 5로 나누어 떨어지지 않는 수로 판단, 답은 -1
            if (n < 3) {
                answer = -1;
                break;
            }
            // 5킬로그램 자루로 최대한 많이 가져가는게 최적해이기 때문에
            // n에서 3을 빼면서 5의 배수에 해당되는지를 무한 루프로 검사한다.
            n -= 3;
            answer += 1;
        }
        System.out.println(answer);
    }
}

```