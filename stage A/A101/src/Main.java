/**
 * Fair Candy Swap
 * https://leetcode.com/problems/fair-candy-swap/
 * **/
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] alice = {32,38,8,1,9};
        int[] bob = {68,92};
        int[] result = s.fairCandySwap(alice, bob);
        System.out.println("Alice must exchange " + result[0] + " candies.");
        System.out.println("Bob must exchange " + result[1] + " candies.");
    }
}