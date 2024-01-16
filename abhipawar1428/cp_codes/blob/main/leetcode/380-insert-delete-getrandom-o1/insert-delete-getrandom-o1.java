class RandomizedSet {
    HashSet<Integer> obj;
    ArrayList<Integer> list;
    Random rnd;
    public RandomizedSet() {
        obj=new HashSet<>();
        list=new ArrayList<>();
        rnd=new Random();
    }
    
    public boolean insert(int val) {
        if(obj.add(val)){
            list.add(val);
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
        if(obj.remove(val)==true){
            for(int i=0;i<list.size();i++){
                if(list.get(i)==val){
                    list.remove(i);
                    return true;
                }
            }
        }
        return false;
    }
    
    public int getRandom() {
        return list.get(rnd.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */