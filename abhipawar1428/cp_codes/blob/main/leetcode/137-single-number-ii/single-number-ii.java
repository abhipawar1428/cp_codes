class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        int i=0;
        while(true){
            hmap.put(nums[i],hmap.getOrDefault(nums[i],0)+1);
            i++;
            if(i==nums.length){
                break;
            }
        }
        for(int key:hmap.keySet()){
            if(hmap.get(key)==1){
                return key;
            }
        }
        return -1;
    }
}