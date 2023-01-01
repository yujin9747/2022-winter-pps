import java.util.*;
/*
* Pascal's triangle
* https://leetcode.com/problems/pascals-triangle/
*
* 파스칼 트라이앵글을 이중 리스트로 만들어 반환한다.
* */

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<List<Integer>> list = s.generate(5);
        System.out.println(list);
    }
}