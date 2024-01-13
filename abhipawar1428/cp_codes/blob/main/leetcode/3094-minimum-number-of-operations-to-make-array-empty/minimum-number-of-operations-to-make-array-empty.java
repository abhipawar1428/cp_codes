class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> countMap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            countMap.put(nums[i],countMap.getOrDefault(nums[i],0)+1);
        }
        int count=0;
        for(int key:countMap.keySet()){
            int num=countMap.get(key);
            System.out.println(num);
            if(num==1){
                return -1;
            }
            while(num!=1){
                if(num%3==0){
                    count+=(num/3);
                    num=1;
                }else if(num%3>1){
                   
                    count+=num/3;
                    num=num%3;

                    count+=num/2;
                    num=1;
                }else{
                    count+=(num-3)/3;
                    num=((num-3)%3)+3;
                    count+=num/2;
                    num=1;
                }
            }
        }
        return count;
    }
}