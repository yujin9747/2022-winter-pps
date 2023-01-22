public class Solution {
    public void moveZeroes(int[] nums) {
        int indexOfNoneZero = 0;
        int numberOfZeros = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                numberOfZeros++;
            }
            else {
                nums[indexOfNoneZero] = nums[i];
                indexOfNoneZero++;
            }
        }

        for(int i=nums.length-numberOfZeros; i<nums.length; i++) nums[i] = 0;

    }
}
