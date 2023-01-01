import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<String>();

        // 숫자가 없는 경우
        if(nums.length == 0) return result;
        // 숫자가 하나인 경우
        else if(nums.length == 1) {
            result.add(nums[0] + "");
        }

        int cur = nums[0];
        int expected = nums[0] + 1;

        for(int i=1; i<nums.length; i++){
            // 마지막 숫자인 경우
            if(i == nums.length-1) {
                // cur -> 마지막 으로 범위가 끝나는 경우
                if(expected == nums[i]) result.add(cur + "->" + nums[i]);
                else {
                    // cur->cur 범위가 만들어지는 경우
                    if(expected-1 == cur) result.add(cur + "");
                    // cur->expected-1 범위가 만들어지는 경우
                    else result.add(cur + "->" + (expected-1));

                    // 마지막 숫자 -> 마지막 숫자 범위
                    result.add(nums[i] + "");
                }
            }
            // 마지막 숫자 X, 범위가 이어지는 경우
            else if(nums[i] == expected){
                expected++;
            }
            // 범위가 끊기는 경우
            else {
                // cur->cur 범위가 만들어지는 경우
                if(expected-1 == cur) result.add(cur + "");
                // cur->expected-1 범위가 만들어지는 경우
                else result.add(cur + "->" + (expected-1));

                // cur : 새로운 범위 시작지점
                cur = nums[i];
                expected = nums[i] + 1;
            }
        }
        return result;
    }
}
