/**
 * Maximum Units on a Truck
 * https://leetcode.com/problems/maximum-units-on-a-truck/description/
 * **/
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] boxTypes  = {{1,3},{5,5},{2,5},{4,2},{4,1},{3,1},{2,2},{1,3},{2,5},{3,2}};
        System.out.println(s.maximumUnits(boxTypes, 35));
    }
}