/**
 * 1. ( 를 만났을 때
 *      괄호의 시작
 *      outermost 인지는 알 수 없는 상황
 * 2. )를 만났을 때
 *      괄호의 끝
 *      이전의 괄호의 시작이 지금까지 괄호가 끝난 것보다 숫자가 크다면, outermost가 아님
 *      이전의 괄호의 시작 개수와 지금까지 괄호가 끝난 개수가 같다면 outermost 맞음
 * **/
public class Solution {
    public String removeOuterParentheses(String s) {
        String result="";
        int open=0;
        int close=0;
        int startPosition=0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '('){
                open++;
            }
            else if(s.charAt(i) == ')'){
                close++;
                if(open == close){  // outermost 인 경우
                   if(close != 1) { // () 하나만 있는 경우는 ""이므로 문자열 추가 안 함
                       result += s.substring(startPosition + 1, startPosition + (close* 2 - 1));    // ((())) 였다면 (())만 잘라서 추가
                   }
                   // 위치 및 open, close 개수 재할당
                   startPosition = i + 1;
                   open=0;
                   close=0;
                }
            }
        }
        return result;
    }
}
