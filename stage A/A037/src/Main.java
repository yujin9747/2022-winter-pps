import java.util.ArrayList;
import java.util.List;

/**
 * Self Dividing Numbers
 * https://leetcode.com/problems/self-dividing-numbers/
 * **/
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Integer> result = s.selfDividingNumbers(47, 85);
        for(int i=0; i<result.size(); i++){
            System.out.println(result.get(i));
        }
    }
}