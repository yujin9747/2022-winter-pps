/**
 * Next Greater Element
 * https://leetcode.com/problems/next-greater-element-i/
 * **/
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums1 = {2, 4};
        int[] nums2 = {1, 2, 3, 4};
        int[] result = s.nextGreaterElement(nums1, nums2);
        for(int i=0; i<result.length; i++) System.out.print(result[i] + " ");
    }
}