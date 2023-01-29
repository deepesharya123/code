class LRUCache {
    
//     key , value
    HashMap<Integer,Integer> mp = new HashMap<>();
//      st = contains the key in the order in which they were interacted
    HashSet<Integer> st = new LinkedHashSet<>();
    int siz = -1;
    
    public LRUCache(int capacity) {
        siz = capacity;
    }
    
    public int get(int key) {
        if(!mp.containsKey(key))
            return -1;
        
        st.remove(key);
        st.add(key);
        return mp.get(key);
    }
    
    public void put(int key, int value) {
        if(mp.size()<siz || mp.containsKey(key)){
            mp.put(key,value);
        }else{
            int rem = st.iterator().next();
            mp.remove(rem);
            st.remove(rem);
            mp.put(key,value);
        }
        if(st.contains(key));
        st.remove(key);
        st.add(key);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */