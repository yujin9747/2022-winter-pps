/**
 * Remove Element
 * https://leetcode.com/problems/remove-element/
 * **/
public class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;    // val을 제외한 숫자가 들어갈 위치
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
