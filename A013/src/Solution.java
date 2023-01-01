import java.util.HashMap;
import java.util.Iterator;

public class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++) {
            if(map.containsKey(nums[i])) map.replace(nums[i], 2);
            else map.put(nums[i], 1);
        }
        Iterator<Integer> keys = map.keySet().iterator();
        while(keys.hasNext()){
            int key = keys.next();
            if(map.get(key) == 1) return key;
        }
        return 0;
    }
}
