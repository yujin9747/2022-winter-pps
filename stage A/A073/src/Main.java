import java.util.List;

/**
 * Fizz Buzz
 * https://leetcode.com/problems/fizz-buzz/
 * **/
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<String> result = s.fizzBuzz(15);
        for(int i=0; i<result.size(); i++){
            System.out.print(result.get(i) +  " ");
        }
    }
}