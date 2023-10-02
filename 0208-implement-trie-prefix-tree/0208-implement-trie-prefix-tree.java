class Node{
    Node[] arr;
    boolean flag;
    public Node(){
        arr=new Node[26];
        flag=false;
    }

}

class Trie {

    Node root;

    public Trie() {
        root=new Node();
    }
    
    public void insert(String word) {
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

        for(int i=0;i<n;i++){
            int ch=word.charAt(i)-'a';
            if(cur.arr[ch]==null){
                return false;
            }
            else{
            cur= cur.arr[ch];

            }
        }
        return cur.flag;
        
    }
    
    public boolean startsWith(String prefix) {

        int n=prefix.length();
        Node cur=root;

        for(int i=0;i<n;i++){
            int ch=prefix.charAt(i)-'a';
            if(cur.arr[ch]==null){
                return false;
            }
            else{
            cur= cur.arr[ch];

            }
        }
        return true;
        
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */