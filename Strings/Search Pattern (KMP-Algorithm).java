//  Day 18 / 160

//   https://www.geeksforgeeks.org/batch/gfg-160-problems/track/string-gfg-160/problem/search-pattern0205

class Solution {

    ArrayList<Integer> search(String pat, String txt) {
        // your code here
        int n = txt.length(); 
        int m = pat.length(); 
        int[] lps = buildLPS(pat);

        ArrayList<Integer> result = new ArrayList<>(); 
        int i = 0; 
        int j = 0; 
        while (i < n) {
            if (txt.charAt(i) == pat.charAt(j)) { 
                i++;
                j++;
            }
            if (j == m) { 
                result.add(i - j);
                j = lps[j - 1]; 
            } else if (i < n && txt.charAt(i) != pat.charAt(j)) { 
                if (j != 0) {
                    j = lps[j - 1]; 
                } else {
                    i++; 
                }
            }
        }

        return result;
    }
    private static int[] buildLPS(String pat) {
        int m = pat.length();
        int[] lps = new int[m];
        int len = 0; 
        int i = 1; 

        lps[0] = 0; 

        while (i < m) {
            if (pat.charAt(i) == pat.charAt(len)) { 
                len++;
                lps[i] = len;
                i++;
            } else { 
                if (len != 0) {
                    len = lps[len - 1]; 
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }
}
