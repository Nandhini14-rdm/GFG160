// Day 24 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/sorting-gfg-160/problem/overlapping-intervals--170633

class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        // Code here // Code here
        int n = arr.length;
        Arrays.sort(arr, (a,b)->Integer.compare(a[0], b[0]));
        List<int[]> list = new ArrayList<>();
        for(int[] a : arr){
            if(list.isEmpty() || a[0]>list.get(list.size()-1)[1]){
                list.add(a);
            }
            else{
                list.get(list.size()-1)[1] = Math.max(list.get(list.size()-1)[1] , a[1]);
            }
        }
        return list;
    }
}
