class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        TreeMap<Integer,Integer> defMap=new TreeMap<>();
        for(int i=0;i<matches.length;i++){
            defMap.put(matches[i][1],defMap.getOrDefault(matches[i][1],0)+1);
        }
        ArrayList<Integer> d=new ArrayList<>();
        for(int key:defMap.keySet()){
            if(defMap.get(key)==1){
                d.add(key);
            }
        }
        TreeSet<Integer> tSet=new TreeSet<>();
        ArrayList<Integer> w=new ArrayList<>();
        for(int i=0;i<matches.length;i++){
            if(!defMap.containsKey(matches[i][0])){
                tSet.add(matches[i][0]);
            }
        }
        for(int key:tSet){
            w.add(key);
        }
        //Collections.sort(w);
        List<List<Integer>> ret=new ArrayList<>();
        ret.add(w);
        ret.add(d);
        return ret;

    }
}