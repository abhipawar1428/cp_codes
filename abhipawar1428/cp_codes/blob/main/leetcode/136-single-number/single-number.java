class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hmap.put(nums[i],hmap.getOrDefault(nums[i],0)+1);
        }
        for(int key:hmap.keySet()){
            if(hmap.get(key)==1){
                return key;
            }
        }
        return -1;
    }
}