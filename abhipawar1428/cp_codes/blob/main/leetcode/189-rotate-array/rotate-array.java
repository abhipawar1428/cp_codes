class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;             //if d is greater than n then arrayIndexOutOfBoundException occurs
                               //to avoid this scenario we do d%n opeartion 
                               //if n=5  d=6 then do only rotation 1 time
        int rArr[]=new int[k];
        int temp=0;
        for(int i=nums.length-k;i<nums.length;i++){
            rArr[temp]=nums[i];
            temp++;
        }
        /*for(int i=0;i<rArr.length;i++){
            System.out.println(rArr[i]);
        }*/
        temp=nums.length-1;;
        for(int i=nums.length-k-1;i>=0;i--){
            nums[temp]=nums[i];
            temp--;
        }
        
        for(int i=0;i<rArr.length;i++){
            nums[i]=rArr[i];
            
        }
    }
}