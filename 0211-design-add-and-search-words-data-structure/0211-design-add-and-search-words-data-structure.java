class Node{
    Node[] arr;
    boolean flag;
    public Node(){
        arr=new Node[26];
        flag=false;
    }

}
class WordDictionary {
    
         Node root;

    public WordDictionary() {
        root=new Node();
    }
    
    public void addWord(String word) {
       int n=word.length();
        Node cur=root;

        for(int i=0;i<n;i++){
            int ch=word.charAt(i)-'a';
            if(cur.arr[ch]==null){
                cur.arr[ch]=new Node();
            }
            cur= cur.arr[ch];
        }
        cur.flag=true;
        
    }
    
    public boolean search(String word) {
       int n=word.length();
        Node cur=root;
        boolean ans=false;

        for(int i=0;i<n;i++){
            if(word.charAt(i)=='.'){

               return helper1( word, i, cur);

            }
            else{
            int ch=word.charAt(i)-'a';
            if(cur.arr[ch]==null){
                return false;
            }
            else{
            cur= cur.arr[ch];

            }
        }}
        return cur.flag;
        
    }
    public boolean helper1(String word,int idx,Node cur){
        Node tempcur=cur;
        int tempidx=idx;
        boolean ans=false;

        for(int i=0;i<26;i++){
            cur=tempcur.arr[i];
            if(cur==null) continue;
int j;
            w:for( j=idx+1;j<word.length();j++){


                if(word.charAt(j)=='.') {
                    ans|=helper2( word, j, cur);
                    break w;
                    }
                 else{
            int ch=word.charAt(j)-'a';
            if(cur.arr[ch]==null) {
                break w;
                }
             
            else 
            cur= cur.arr[ch];
    }



        }
        ans|=(cur.flag&&j==word.length());
        }
        return ans;

    }
    

    public boolean helper2(String word,int idx,Node cur){
        Node tempcur=cur;
        int tempidx=idx;
        boolean ans=false;

        for(int i=0;i<26;i++){
            cur=tempcur.arr[i];
             if(cur==null) continue;
int j;
            w:for(  j=idx+1;j<word.length();j++){
  
            int ch=word.charAt(j)-'a';
            if(cur.arr[ch]==null) 
                break w;
             else 
            cur= cur.arr[ch];
          }
          ans|=(cur.flag&&j==word.length());
      }

        return ans;


    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */