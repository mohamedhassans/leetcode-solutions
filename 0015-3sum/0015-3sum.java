class Solution {
   public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<Integer> numshs = new HashSet<>();
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i : nums) {
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }
        for (int i : nums) numshs.add(i);
        HashSet<List<Integer>> hs = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numshs.contains(-1 * (nums[i] + nums[j]))) {
                    boolean ft = nums[i] == -1 * (nums[i] + nums[j]);
                    boolean st = -1 * (nums[i] + nums[j]) == nums[j];
                    if(ft&st&mp.get(nums[i])<3) continue;
                    else if(ft&mp.get(nums[i])<2) continue;
                    else if(st&mp.get(nums[j])<2) continue;
                    List<Integer> cur = new ArrayList<>();
                    cur.add(nums[i]);
                    cur.add(nums[j]);
                    cur.add(-1 * (nums[i] + nums[j]));
                    Collections.sort(cur);
                    hs.add(cur);


                }

            }
        }

        // System.out.println(hs);
        for (List<Integer> i : hs) {
            ans.add(i);
        }
        return ans;
    }

    
}