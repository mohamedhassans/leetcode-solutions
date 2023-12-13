class Solution {
     static boolean check(int[] bloomDay, int m, int k, long mid) {
        long val = 0;
        long count = 0;

        for (int j : bloomDay) {
            if (j <= mid) {
                count++;
            } else {
                val += (count / k);
                count = 0;
            }

        }
        val += (count / k);

        return val >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        long l = 1;
        long r = (long) 1e12;
        long ans = -1;
        while (l <= r) {
            long mid = (l + r) >> 1;

            if (check(bloomDay, m, k, mid)) {
                ans = mid;
                r = mid - 1;
            } else {

                l = mid + 1;
            }


        }
        return (int) ans;
    }
}