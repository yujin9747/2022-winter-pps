public class Solution {

    // sqrt(x) 문제 응용해서 품. A038에서 발전.
    public boolean isPerfectSquare(int num) {
        if(num == 1) return true;
        double i=1;
        double multiply=i*i;
        while(true){
            if(multiply == num) return true;
            else if(multiply > num) break;
            i++;
            multiply = i*i;
        }
        return false;
    }
}
