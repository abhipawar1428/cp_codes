class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> countMap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            countMap.put(nums[i],countMap.getOrDefault(nums[i],0)+1);
        }
        int count=0;
        for(int key:countMap.keySet()){
            if(countMap.get(key)==1){
                return -1;
            }
            count+=countMap.get(key)/3;
            if(countMap.get(key)%3!=0){
                count++;
            }
        }
        return count;
    }
}