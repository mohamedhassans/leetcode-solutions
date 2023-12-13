class Solution {
static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    public static int gcd(int f, int b) {
        if (f == 0)

            return b;

        return gcd(b % f, f);
    }
    static boolean check(int n, int a, int b, long mid) {


        int M = (int) (1e9 + 7);

        long numa = mid / a;
        long numb = mid / b;
        long sum = numa + numb - mid/lcm(a,b);
        return sum >= n;


    }

    public static int nthMagicalNumber(int n, int a, int b) {

        long l = 0;
        int M = (int) (1e9 + 7);

        long r = (long) 1e16;
        long ans = -1;
        while (l <= r) {

            long mid = (l + r) >> 1;
            if (check(n, a, b, mid)) {
                if (mid % a == 0 || mid % b == 0) {
                    ans = mid % M;
                }
                r = mid - 1;
            } else {
                l = mid + 1;
            }


        }
        return (int)ans;

    }

}