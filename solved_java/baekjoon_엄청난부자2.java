package solved;

import java.math.BigInteger;
import java.util.Scanner;

public class baekjoon_엄청난부자2 {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        BigInteger n;
        BigInteger m;

        n = sc.nextBigInteger();
        m = sc.nextBigInteger();

        BigInteger answer = n.divide(m);
        BigInteger mod = n.mod(m);
        System.out.println(mod);
        System.out.println(answer);
    }
}
