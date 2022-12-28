/*
* 나누어 떨어지는 숫자 배열
* https://school.programmers.co.kr/learn/courses/30/lessons/12910?language=java
* array 의 각 element 중 divisor 로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution 을 작성해주세요.
* divisor 로 나누어 떨어지는 element 가 하나도 없다면 배열에 -1을 담아 반환하세요.
* 배열에는 서로 다른 숫자가 들어가 있음.
* 오름차순으로 정렬해서 출력
* */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {5, 9, 7, 10};
        int[] result = s.solution(arr, 5);
        for(int i=0; i<result.length; i++)
            System.out.println(result[i]);
    }
}