class Solution {
    public int[] searchRange(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        int N=e+1;
        int mid=-1;


        int arr[]=new int[2];
        if(N==0){
            arr[0]=arr[1]=-1;
            return arr;
        }
        while(s<=e){
            mid=(s+e)/2;

            if(nums[mid]==target){
                break;
            }else if(nums[mid]>target){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        while(nums[mid]==target){
            if(mid==0){
                arr[0]=mid;
                break;
            }
            mid--;
            if(nums[mid]!=target){
                arr[0]=++mid;
                break;
            }
        }
        while(nums[mid]==target){
            if(mid==N-1){
                arr[1]=mid;
                return arr;
            }
            mid++;
            if(nums[mid]!=target){
                arr[1]=--mid;
                return arr;
            }
        }
        arr[0]=arr[1]=-1;
        return arr;
    }
}