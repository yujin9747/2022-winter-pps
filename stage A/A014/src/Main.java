import java.util.List;
/**
 * https://leetcode.com/problems/summary-ranges/
 * Summary ranges
 *
 * 정렬된 문자 배열안에서 range 정리하점
 * **/
public class Main {
    public static void main(String[] args) {

        Solution s = new Solution();
        int[] nums = {-1};
        List<String> result = s.summaryRanges(nums);
        for(int i=0; i<result.size(); i++) System.out.println(result.get(i));
    }
}