
public class Solution {
    public int heightChecker(int[] heights) {
        // heights를 가지고 expected heights를 생성한다.
        Expected expected = new Expected();
        heights  = expected.setSorted(heights);

        // 둘을 비교하며 맞지 않는 곳을 체크한다.
        int count = expected.getDifference(heights);
        return count;
    }
}
