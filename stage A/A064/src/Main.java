/**
 * Height Checker
 * https://leetcode.com/problems/height-checker/
 *
 * 객체 지향으로 풀려고 노력해본 문제
 * -> 코딩테스트 볼 때는 객체 지향 말고 절차 지향으로 풀 예정이기 때문에 가끔 시도해 볼 예정
 * **/
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] heights = {1,1,4,2,1,3};
        System.out.println(s.heightChecker(heights));
    }
}