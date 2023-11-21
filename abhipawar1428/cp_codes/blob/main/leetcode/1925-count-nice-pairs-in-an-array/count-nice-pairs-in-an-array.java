class Solution {
    public int countNicePairs(int[] nums) {
        final int mid=(int)1000000007;
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]-rev(nums[i]);
        }
        HashMap<Integer,Integer> hMap=new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            int temp=hMap.getOrDefault(nums[i],0);
            count=(count+temp)%mid;
            hMap.put(nums[i],temp+1);
        }
        return count%mid;
    }
    public static int rev(int num){
        int rev=0;
        while(num!=0){
            int r=num%10;
            num=num/10;
            rev=rev*10+r;
        }
        return rev;
    }
}