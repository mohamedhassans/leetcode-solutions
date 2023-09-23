class MedianFinder {
    
       ArrayList<Integer> arr;



    public MedianFinder() {
        arr=new ArrayList<>();
        
    }
    
    public void addNum(int num) {
       // new MedianFinder();
        int i=0;
        while(i<arr.size()&&num>=arr.get(i)) i++;

        arr.add(i,num);
        
    }
    
    public double findMedian() {

        int n=arr.size();
        if(n==0) return 0;
        else if(n==2)return (arr.get(0)+arr.get(1))/2.0 ;
        else if(n%2==1) return arr.get(n/2);
        else return (arr.get(n/2-1)+arr.get( n/2 ))/2.0;
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */