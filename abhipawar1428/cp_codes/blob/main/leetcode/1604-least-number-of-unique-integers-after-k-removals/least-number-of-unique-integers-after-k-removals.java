class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        ArrayList<Integer> ar=new ArrayList<>();
        for(int key:map.keySet()){
            ar.add(map.get(key));
        }
        Collections.sort(ar);
        int ptr=0;
        
        while(k>0){
            ar.set(ptr,ar.get(ptr)-1);
            k--;
            
            if(ar.get(ptr)==0){
                ptr++;
            }
            if(k==0){
                break;
            }
        }
        return ar.size()-ptr;
    }
}