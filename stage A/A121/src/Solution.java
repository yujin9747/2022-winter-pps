import java.util.*;

public class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxCount=0, maxNum=0, max=-1;
        if(nums.length == 1) return 1;
        for(int i=0; i<nums.length; i++){
            if(map.keySet().contains(nums[i])){
                map.replace(nums[i], map.get(nums[i]), map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }

            if(map.get(nums[i]) > max) max = map.get(nums[i]);
        }
        Iterator<Integer> keys = map.keySet().iterator();
        List<Integer> equalMax = new ArrayList<>();
        while(keys.hasNext()){
            int key = keys.next();
            if(map.get(key) == max) equalMax.add(key);
        }
        int shortest=nums.length+1;
        int start, count, j;
        for(int i=0; i<equalMax.size(); i++){
            maxNum = equalMax.get(i);
            start = -1;
            count=0;
            for(j=0; j<nums.length; j++){
                if(nums[j] == maxNum) {
                    if(start<0) start=j;
                    count++;
                }

                if(count == max) break;
            }
            if(j-start+1 < shortest) shortest = j-start+1;
        }
        return shortest;
    }
}
