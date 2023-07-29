package LeetCodeProblems;

import org.w3c.dom.CDATASection;

import java.awt.image.BandedSampleModel;
import java.sql.SQLOutput;

// Link - https://leetcode.com/problems/minimum-speed-to-arrive-on-time/description/
public class MinSpeed {
    public static void main(String[] args) {
        int[] dist = {1, 1, 100000};
        double hour = 2.01;
        System.out.println(minSpeedOnTime(dist, hour));
        CommuteToOffice obj = new CommuteToOffice();
//        System.out.println(obj.minSpeedOnTime(dist,hour));

    }

    public static int minSpeedOnTime(int[] dist, double hour) {
        int n = dist.length;

        int l = 1;
        int r = (int) 1e7;
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (isPossible(mid, dist, hour)) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return ans;


    }

    private static boolean isPossible(int speed, int[] dist, double hour) {
        double time = 0.0;
        for (int i = 0; i < dist.length ; i++) {
            time += (i != dist.length - 1) ? Math.ceil(dist[i] * 1.0 / speed) : ((double) dist[i] / speed);

            if (time > hour) {
                return false;
            }
        }
        return time <= hour;

    }
}