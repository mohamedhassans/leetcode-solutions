class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Integer,  ArrayList<Integer>> map=new HashMap<>();

        for(int i=0;i<strs.length;i++){
            String s=strs[i];
            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            int hash=Arrays.hashCode(arr);
            if(!map.containsKey(hash)){
                map.put(hash,new ArrayList<>());
            }
            map.get(hash).add(i); 
        }
        List<List<String>> ans=new ArrayList<>();
        for(Map.Entry<Integer, ArrayList<Integer>> entry:map.entrySet()){
        
        ArrayList<Integer> cur=entry.getValue();
        List<String> curans=new ArrayList<>();


    for(int i:cur) curans.add(strs[i]);

    ans.add(curans);
        
        }

        return ans;
        
    }
}