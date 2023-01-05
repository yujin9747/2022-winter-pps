/**
 * i=0 : i*i = 0
 * i=1 : i*i = 1 -> 1, 2, 3
 * i=2 : i*i = 4 -> 4, 5, 6, 7, 8
 * i=3 : i*i = 9 -> 9, 10, 11, 12, 13, 14, 15
 * **/
public class Solution {
    public int mySqrt(int x) {
        if(x == 1) return 1;
        double i=1;
        double multiply = i*i;
        while(multiply <= x){
            i++;
            multiply = i*i;
        }
        return (int)i-1;
    }
}
