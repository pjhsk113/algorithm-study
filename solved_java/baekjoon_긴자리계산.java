package solved;

import java.math.BigInteger;
import java.util.Scanner;

public class baekjoon_긴자리계산 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a, b;
        a = sc.nextBigInteger();
        b = sc.nextBigInteger();

        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));
    }
}
