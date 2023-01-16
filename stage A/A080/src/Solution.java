import java.util.HashMap;
import java.util.Map;

/**
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 * **/
public class Solution {
    public int majorityElement(int[] nums) {
        int criteria = nums.length/2;
        int result=0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i]) == false){
                map.put(nums[i], 0);
            }
            else {
                map.replace(nums[i], map.get(nums[i]) + 1);
            }

            if(map.get(nums[i]) >= criteria) {
                result = nums[i];
                break;
            }
        }
        return result;
    }
}
