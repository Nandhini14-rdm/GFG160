//  Day 75 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/recursion-and-backtracking-gfg-160/problem/permutations-of-a-given-string2041

class Solution {
    public ArrayList<String> findPermutation(String s) {
        // Code here
        int n = s.length();
        char[] str = s.toCharArray();
        Arrays.sort(str);
        ArrayList<String> list = new ArrayList<>();
        permute(str, 0, n, list);
        return list;
    }
    
    public static void swap(char[] str, int x, int y){
        char temp = str[x];
        str[x] = str[y];
        str[y] = temp;
    }
    public static void permute(char[] s, int si, int n, ArrayList<String> list){
        if(si==n){
            list.add(new String(s));
            return;
        }
        for(int i=si; i<n; i++){
            if(i!=si && s[i]==s[si]) continue;
            swap(s, si, i);
            permute(Arrays.copyOf(s, n), si+1, n, list);
            //swap(s, si, i);
        }
    }
}
