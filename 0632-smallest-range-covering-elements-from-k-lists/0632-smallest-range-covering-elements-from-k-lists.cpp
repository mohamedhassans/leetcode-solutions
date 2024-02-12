class Solution {
public:
   vector<int> smallestRange(vector<vector<int>>& nums) {
    map<int, int> m;
    multiset<int> s;
    set<pair<int, int>> st;
    int n = nums.size();
    for (int i = 0; i < n; i++) {
        for (auto x: nums[i]) {
            st.insert({x, i});
        }
    }
    vector<int> ans;


    while(st.size()!=0){
        auto it = st.begin();
        int x = it->first;
        int sec = it->second;
        st.erase(it);

        if(m.find(sec)!=m.end())
            s.erase(s.find(m[sec]));

        m[sec] = x;
        s.insert(x);

        if(m.size()==n){
            if(ans.empty() || *s.rbegin()-*s.begin()<ans[1]-ans[0]){
               ans = {*s.begin(), *s.rbegin()};
            }
        }


    }
    return ans;
}
};