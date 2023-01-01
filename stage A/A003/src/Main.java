/*
* Plus One
* https://leetcode.com/problems/plus-one/
*
* Input: digits = [1,2,3]
* Output: [1,2,4]
* Explanation: The array represents the integer 123.
* Incrementing by one gives 123 + 1 = 124.
* Thus, the result should be [1,2,4].
* */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] digits = {1, 2, 3};
        int[] result = s.plusOne(digits);
        //System.out.println(result);
        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }
}