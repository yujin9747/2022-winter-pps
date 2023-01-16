/**
 * k번째 수
 * https://school.programmers.co.kr/learn/courses/30/lessons/42748
 * **/
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] result = s.solution(array, commands);
        for(int i=0; i<result.length; i++) System.out.println(result[i]);
    }
}