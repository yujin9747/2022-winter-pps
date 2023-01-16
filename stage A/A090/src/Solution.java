class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;    // 중복 제거 후 숫자가 들어가야 할 위치
        int curr=nums[0]; // 현재 중복되고 있는 숫자
        for(int i=1; i<nums.length; i++){
            if(curr != nums[i]){
                nums[k] = curr;
                curr = nums[i];
                k++;
            }
        }
        nums[k] = curr; // 마지막 숫자 넣기
        return k+1;
    }
}
