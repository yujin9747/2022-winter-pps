import static java.util.Arrays.sort;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {3,2,2,3};
        int[] expectedNums = {2,2};
        int k = s.removeElement(nums, 3); // Calls your implementation

        assert k == expectedNums.length;
        sort(nums, 0, k); // Sort the first k elements of nums
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}