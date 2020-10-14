package solved;

import java.util.Scanner;

public class baekjoon_수도요금 {
    public static void main(String[] args) {
        int literPerWon; // X사 요금
        int defaultFee, upperLimit, literPerSurcharge; // Y사 요금제
        int useWater;
        int x, y;
        Scanner sc = new Scanner(System.in);

        literPerWon = sc.nextInt();
        defaultFee = sc.nextInt();
        upperLimit = sc.nextInt();
        literPerSurcharge = sc.nextInt();
        useWater = sc.nextInt();

        x = X(literPerWon, useWater);
        y = Y(defaultFee, upperLimit, literPerSurcharge, useWater);

        if (x > y) {
            System.out.println(y);
        } else {
            System.out.println(x);
        }
    }
    public static int X(int literPerWon, int useWater) {
        return literPerWon * useWater;
    }

    public static int Y(int defaultFee, int upperLimit, int literPerSurcharge, int useWater) {
        if (upperLimit >= useWater) {
            return defaultFee;
        }
        int totalFee = defaultFee;
        int usage = useWater - upperLimit;
        for (int i = 0; i < usage; i++) {
            totalFee += literPerSurcharge;
        }
        return totalFee;
    }
}
