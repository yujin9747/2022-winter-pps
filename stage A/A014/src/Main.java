import java.util.List;

public class Main {
    public static void main(String[] args) {

        Solution s = new Solution();
        int[] nums = {0,1,2,4,5,7};
        List<String> result = s.summaryRanges(nums);
        for(int i=0; i<result.size(); i++) System.out.println(result.get(i));
    }
}