/**
 * Sort array by parity 2
 * https://leetcode.com/problems/sort-array-by-parity-ii/submissions/879107812/
 * **/
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {2, 3};
        int[] result = s.sortArrayByParityII(nums);

        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }
}