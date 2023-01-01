/**
 * Single number
 * https://leetcode.com/problems/single-number/
 *
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * **/
public class Main {
    public static void main(String[] args) {

        Solution s = new Solution();
        int[] nums = {4,1,2,1,2};
        System.out.println(s.singleNumber(nums));
    }
}