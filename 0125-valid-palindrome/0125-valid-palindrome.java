class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        
        ArrayList<Integer> cnt=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            int cur=s.charAt(i);
            if((cur-'a'>-1&&cur-'a'<26)||(cur>='0'&&cur<='9')){
                cnt.add(cur);
            }
        }
        for(int i=0,j=cnt.size()-1;i<=j;i++,j--){
            if(cnt.get(i)!=cnt.get(j)) return false;
        }
        return true;
        
    }
}