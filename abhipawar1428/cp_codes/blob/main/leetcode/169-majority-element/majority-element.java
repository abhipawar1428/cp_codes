class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> ht=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            ht.put(nums[i],ht.getOrDefault(nums[i],0)+1);
        }
        for(int key:ht.keySet()){
            if(ht.get(key)>nums.length/2){
                return key;
            }
        }
        return -1;
    }
}