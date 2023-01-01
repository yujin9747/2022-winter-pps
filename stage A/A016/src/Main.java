/**
 * 구명보트
 * https://school.programmers.co.kr/learn/courses/30/lessons/42885
 *
 * 구명보트를 최대한 적게 사용해서 사람들을 구출하라
 * 1개당 최대 2명, 무게 제한 존재
 *
 * **/
public class Main {
    public static void main(String[] args) {

        Solution s = new Solution();
        int[] people = {70, 80, 50};
        int result = s.solution(people, 100);
        System.out.println(result);
    }
}