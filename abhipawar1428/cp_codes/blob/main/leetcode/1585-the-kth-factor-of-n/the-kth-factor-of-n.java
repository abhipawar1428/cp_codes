class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> al=new ArrayList<>();
        int count=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                al.add(i);
                count++;
            }
            if(count==k){
                return al.get(k-1);
            }
        }
        al.add(n);
        if(k<=al.size())
            return al.get(k-1);
        else
            return -1;
    }
}