package solved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class brandy_심박수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int age = Integer.parseInt(br.readLine());
        int maxHeartRate = 220 - age;

        int[] exercise = new int[6];

        String heartRate;
        while((heartRate = br.readLine()) != null) {
            if (heartRate.isEmpty()) {
                break;
            }
            int standardHeartRate = (int)(((double)Integer.parseInt(heartRate) / maxHeartRate) * 100);
            if (standardHeartRate >= 90) {
                exercise[0]++;
            } else if (standardHeartRate >= 80 && standardHeartRate < 90) {
                exercise[1]++;
            } else if (standardHeartRate >= 75 && standardHeartRate < 80) {
                exercise[2]++;
            } else if (standardHeartRate >= 68 && standardHeartRate < 75) {
                exercise[3]++;
            } else if (standardHeartRate >= 60 && standardHeartRate < 68) {
                exercise[4]++;
            } else {
                exercise[5]++;
            }
        }
        for (int i =0;i<exercise.length; i++) {
            System.out.print(exercise[i] + " ");
        }
    }
}
