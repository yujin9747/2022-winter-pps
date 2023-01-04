import java.util.ArrayList;
import java.util.List;

public class Solution {

    public boolean isSelfDividing(int n){
        int origin=n;
        while(true){
            if(n%10 == 0) return false;
            if(origin%(n%10) != 0) return false;
            n /= 10;
            if(n == 0) break;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> selfDividing = new ArrayList<>();
        for(int i=left; i<=right; i++){
            if(isSelfDividing(i)){
                selfDividing.add(i);
            }
        }
        return selfDividing;
    }
}
