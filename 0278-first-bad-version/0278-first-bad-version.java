/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int ans=-1;
        long l=0;
        long r=n;
        while(l<=r){
            long mid=(l+r)/2;
            if(isBadVersion((int)mid)){
                ans=(int)mid;
                r=mid-1;

            }
            else{
                l=mid+1;
            }
        }
        return ans;
        
    }
}