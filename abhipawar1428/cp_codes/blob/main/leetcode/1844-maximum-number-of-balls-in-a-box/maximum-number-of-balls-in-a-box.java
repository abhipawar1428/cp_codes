class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer,Integer> hMap=new HashMap<>();
        
        for(int i=lowLimit;i<=highLimit;i++){
            int sum=0;
            int temp=i;
            while(temp!=0){
                int r=temp%10;
                sum+=r;
                temp/=10;
            }
            hMap.put(sum,hMap.getOrDefault(sum,0)+1);
        }
        int max=Integer.MIN_VALUE;
        for(int key:hMap.keySet()){
            if(max<hMap.get(key)){
                max=hMap.get(key);
            }
        }
        return max;
    }
}