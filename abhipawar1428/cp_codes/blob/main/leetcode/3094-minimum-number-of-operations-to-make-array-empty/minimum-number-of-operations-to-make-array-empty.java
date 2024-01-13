class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> countMap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            countMap.put(nums[i],countMap.getOrDefault(nums[i],0)+1);
        }
        int count=0;
        for(int key:countMap.keySet()){
            int num=countMap.get(key);
            if(num==1){
                return -1;
            }
            count+=(num+2)/3;           
        }
        return count;
    }
}