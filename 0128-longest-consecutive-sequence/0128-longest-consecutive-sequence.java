class Solution {
    public static int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums)
            set.add(i);
        int ans = 0;
        for(int i : nums){
            if(!set.contains(i-1)){
                int j = i;
                while(set.contains(j))
                    j++;
                ans = Math.max(ans , j-i);
            }
        }
        return ans;

    }
}