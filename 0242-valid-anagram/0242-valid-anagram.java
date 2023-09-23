class Solution {
    public boolean isAnagram(String s, String t) {
        int frq[]=new int [26];
        for(int i=0;i<s.length();i++ ) frq[s.charAt(i)-'a']++;
         for(int i=0;i<t.length();i++ ) frq[t.charAt(i)-'a']--;
         Arrays.sort(frq);
         return frq[0]==frq[25]&&frq[0]==0;
        
    }
}