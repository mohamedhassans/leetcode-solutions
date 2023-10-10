class Solution {
    public String addBinary(String a, String b) {
        Stack<Integer> st=new Stack<>();
        int i=a.length()-1;
        int j=b.length()-1;
        int cary=0;
        while(i>-1||j>-1){
            if(i>-1&&j>-1){
                int cura=a.charAt(i)-'0';
                int curb=b.charAt(j)-'0'; 
                int res=cura+curb+cary;
                int curentvalue=res%2;
                cary=res/2;
                st.push(curentvalue);


            }
            else if (i>-1){
                int cura=a.charAt(i)-'0';
                int res=cura+cary;
                int curentvalue=res%2;
                cary=res/2;
                st.push(curentvalue);

            }
            else{ 
                int curb=b.charAt(j)-'0'; 
                int res=curb+cary;
                 int curentvalue=res%2;
                cary=res/2;
                st.push(curentvalue);

            }

            j--;
            i--;
        }
        if(cary!=0)
        st.push(cary);
         String s = "";
            while (!st.isEmpty()) {
                s += st.pop();
            }
        return s;
        
    }
}