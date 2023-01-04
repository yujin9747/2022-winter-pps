public class Solution {
    public double log4(int x){
        return Math.log(x*1.0) / Math.log(4.0);
    }
    public boolean isPowerOfFour(int n) {
        double logResult = log4(n);
        int integer = (int) logResult;
        if((logResult-integer) == 0) return true;
        return false;
    }
}
