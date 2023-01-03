/**
 * Lemon Change
 * https://leetcode.com/problems/lemonade-change/
 *
 * 가지고 있는 현금 중에, 단위가 가장 큰 것부터 사용해야 최대한 거스름돈을 거슬러 줄 수 있음.
 * **/
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {5,5,10,10,20};
        boolean result = s.lemonadeChange(arr);
        System.out.println(result);
    }
}