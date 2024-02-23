class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int ret[]=new int[k];
        int maxVal=1;
        int maxKey=0;
        int i=0;
        while(k>0){
            k--;
            for(int key:map.keySet()){
                if(map.get(key)>=maxVal){
                    maxKey=key;
                    maxVal=map.get(key);
                    
                }
            }
            ret[i++]=maxKey;
            map.remove(maxKey);
            maxVal=1;
        }
        return ret;
    }
}