//  Day 57 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/two-pointer-technique-gfg-160/problem/count-distinct-elements-in-every-window

class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<k; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        list.add(map.size());
        for(int i=k; i<arr.length; i++){
            if(map.get(arr[i-k])==1){
                map.remove(arr[i-k]);
            }else{
                map.put(arr[i-k], map.get(arr[i-k])-1);
            }
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            list.add(map.size());
        }
        return list;
    }
}
