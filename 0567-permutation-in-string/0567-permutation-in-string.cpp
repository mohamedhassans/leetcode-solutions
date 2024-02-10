class Solution {
public:
    bool comp(vector<int> &s1, vector<int> &s2){
        for(int i=0; i<26;i++)
            if(s1[i]!=s2[i]) return false;
        return true ;
    }
    
    bool checkInclusion(string s1, string s2) {
        int n=s1.length();
        int m=s2.length();
        if(m<n) return false;
        vector<int> vs1(26);
        vector<int> vs2(26);
        for(int i=0;i<n;i++){
            vs1[s1[i]-'a']++;
            vs2[s2[i]-'a']++;
        }
        if(comp(vs1,vs2)) return true;
        
        for(int i=n;i<m;i++){
            vs2[s2[i-n]-'a']--;
            vs2[s2[i]-'a']++;
            if(comp(vs1,vs2)) return true;
           
        }
        return false;
        
        
    }
    
};