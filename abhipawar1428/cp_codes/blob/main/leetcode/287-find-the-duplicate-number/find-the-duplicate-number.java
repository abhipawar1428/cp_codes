class Solution {
    public int findDuplicate(int[] nums) {
        /*HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hmap.put(nums[i],hmap.getOrDefault(nums[i],0)+1);
        }
        for(int num:hmap.keySet()){
            if(hmap.get(num) != 1){
                return num;
            }
        }
        return -1;*/

        HashSet<Integer> hset=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(hset.contains(nums[i])){
                return nums[i];
            }else{
                hset.add(nums[i]);
            }
        }
        return -1;
    }
}