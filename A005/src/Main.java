/*
* 스킬트리
* https://school.programmers.co.kr/learn/courses/30/lessons/49993
* 선행 스킬 순서 skill과 유저들이 만든 스킬트리1를 담은 배열 skill_trees가 매개변수로 주어질 때,
* 가능한 스킬트리 개수를 return 하는 solution 함수를 작성해주세요.
* */
public class Main {
    public static void main(String[] args) {

        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};   // no, yes, yes, no

        Solution s = new Solution();
        int result = s.solution(skill, skill_trees);

        System.out.println(result);     // 2
    }
}