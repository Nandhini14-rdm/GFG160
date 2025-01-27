// Day 74 / 160

//   https://www.geeksforgeeks.org/batch/gfg-160-problems/track/linked-list-gfg-160/problem/lru-cache

class LRUCache {
    // Constructor for initializing the cache capacity with the given value.
    private static int cap;
    private static Map<Integer, Integer> map;
    private static LinkedList<Integer> list;
    
    LRUCache(int cap) {
        // code here
        this.cap = cap;
        this.map = new HashMap<>();
        this.list = new LinkedList<>();
        
    }

    // Function to return value corresponding to the key.
    public static int get(int key) {
        // your code here
        if(!map.containsKey(key)) return -1;
        list.remove(Integer.valueOf(key));
        list.addFirst(key);
        return map.get(key);
    }

    // Function for storing key-value pair.
    public static void put(int key, int value) {
        // your code here
        
        if(map.containsKey(key)){
            map.put(key, value);
            list.remove(Integer.valueOf(key));
        }
        else{
            if(map.size()>=cap){
                int luk = list.removeLast();
                map.remove(luk);
            }
            map.put(key, value);
        }
        list.addFirst(key);
        
    }
}
