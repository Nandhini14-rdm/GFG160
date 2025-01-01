// Day 48/160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/hashing-gfg-160/problem/print-anagrams-together

class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        Map<String , ArrayList<String>> map = new HashMap<>();
        for(String s : arr){
            char[] letters = s.toCharArray();
            Arrays.sort(letters);
            String sort = new String(letters);
            if(!map.containsKey(sort)){
                map.put(sort, new ArrayList<>());
            }
            map.get(sort).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
