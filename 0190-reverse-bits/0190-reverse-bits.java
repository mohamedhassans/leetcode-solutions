public class Solution {
    // you need treat n as an unsigned value
//   public static int reverseBits(int n) {
//         StringBuilder st=new StringBuilder();
//         for (int i = 0; i < 32; i++) {
//             st.append(n&1);
//             n>>=1;
//         }
//         int res=0;
//         for (int i = 0; i < st.length(); i++) {
//             res<<=1;
//             res+=st.charAt(i)-'0';
//         }
//         return res;


//     }
public static int reverseBits(int n) {
        StringBuilder st=new StringBuilder();
        for (int i = 0; i < 32; i++) {
            st.append(n&1);
            n>>=1;
        }
        int res=0;

        return (int)Long.parseLong (st.toString(),2);


    }
}