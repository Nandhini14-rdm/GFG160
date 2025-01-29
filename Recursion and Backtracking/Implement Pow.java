//  Day 76 / 160

//   https://www.geeksforgeeks.org/batch/gfg-160-problems/track/recursion-and-backtracking-gfg-160/problem/powx-n

class Solution {
    double power(double b, int e) {
        // code here
        //double res = 1;
        
        if(e==0) return 1;
        
        if(e<0){
            return 1 / power(b, -e);
        }
        
        double temp = power(b, e/2);
        
        if(e%2==0){
            return temp * temp;
        }else{
            return b * temp * temp;
        }
    }
}
