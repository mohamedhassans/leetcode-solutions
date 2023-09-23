class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {

        return helper(s,wordDict,new HashMap<>());
        
        
    }

    public boolean helper (String s,List<String> wordDict,HashMap <String,Boolean> mp){
        if(s.equals("")) return true;
        if(mp.containsKey(s)) return mp.get(s);
        else{

            for(String st:wordDict){
                if(st.length()<=s.length()&&
                s.substring(0,st.length()).equals(st)){
                    boolean res =helper(s.substring(st.length(),s.length()),wordDict,mp);
                    mp.put(s,res);
                    if(res) return true; 
                }


            }
            return false;



        }

    }
}