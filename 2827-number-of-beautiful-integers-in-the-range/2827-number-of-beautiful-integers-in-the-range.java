class Solution {
    public int numberOfBeautifulIntegers(int low, int high, int k) {
        return (init(high, k) - init(low - 1, k));
        
    }

    
    static int[][][][][][] dp;

    static String s;

    static int init(long num, int k) {
        s = String.valueOf(num);
        int len = s.length();
        dp = new int[len][2][2][9][9][21];

        for (int i = 0; i < len; i++)
            for (int j = 0; j < 2; j++)
                for (int j2 = 0; j2 < 2; j2++)
                    for (int k2 = 0; k2 < 9; k2++)
                        for (int k3 = 0; k3 < 9; k3++)
                            Arrays.fill(dp[i][j][j2][k2][k3], -1);
        return solve(0, 1, 0, 0, 0, 0, k);

    }

    static int solve(int idx, int tight, int started, int sumEven, int sumOdd, int mod, int k) {
        if (idx == s.length())
            return (mod == 0 && sumEven == sumOdd) ? 1 : 0;
        if (dp[idx][tight][started][sumEven][sumOdd][mod] != -1)
            return dp[idx][tight][started][sumEven][sumOdd][mod];

        int max = tight == 1 ? s.charAt(idx) - '0' : 9;
        int ans = 0;
        for (int i = 0; i <= max; i++) {
            int newTight = tight == 1 && i == max ? 1 : 0;
            int newStarted = started == 1 || i != 0 ? 1 : 0;

            ans += solve(idx + 1, newTight, newStarted, (newStarted==1&&i%2==0)?sumEven+1:sumEven, (newStarted==1&&i%2==1)?sumOdd+1:sumOdd
                     , (mod * 10 + i) % k, k);
        }
        return dp[idx][tight] [started][sumEven][sumOdd][mod] = ans;


    }
}