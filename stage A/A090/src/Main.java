/**
 * Remove duplicates from sorted array
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * **/
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] expectedNums = {0, 1, 2, 3, 4};

        int k = s.removeDuplicates(nums);

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            System.out.println(nums[i] + ", "+ expectedNums[i]);
        }
    }
}