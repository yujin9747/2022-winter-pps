import java.util.ArrayList;
import java.util.List;

/**
 * [l,m], [m+1, r] 각 바구니에 담긴 쿠키의 수가 같아야 함.
 * 한 명이 받을 수 있는 최대 쿠키의 수를 반환.
 * 같게 나눌 수 없다면 0을 반환
 *
 * l을 증가하며,
 *  m을 증가하며, 최대 쿠키 수 기록
 *
 * 시간초과 문제 발생함. -> 구간합을 먼저 구하기!
 *
 * 효율성을 높였지만, 효율성 테스트 5번만 통과하지 못함. 
 * **/
public class Solution {
    public int solution(int[] cookie) {
        int answer = 0;
        int first, second;

        List<Integer> section_sum = new ArrayList<>();
        // 0 부터 시작하는 구간합 구하기
        for(int i=0; i<cookie.length; i++){
            if(i == 0) section_sum.add(cookie[i]);
            else section_sum.add(cookie[i]+section_sum.get(i-1));
        }

        for(int l=0; l<cookie.length; l++){
            for(int m=l; m<cookie.length; m++) {

                if(l != 0) first = section_sum.get(m) - section_sum.get(l-1);
                else first = section_sum.get(m);

                if(first <= answer) continue;   // second랑 같은걸 찾아도, 최대의 숫자가 아닌 경우
                if(first > (section_sum.get(cookie.length-1) - section_sum.get(m))) continue; // 남은 모든 쿠키를 second에 더해도 first가 더 큰 경우

                for(int r=m+1; r<cookie.length; r++){
                    second = section_sum.get(r)-section_sum.get(m);
                    if(first == second) {
                        if((section_sum.get(cookie.length-1)/2) % 2 == 0 && first == section_sum.get(cookie.length-1)/2) return first;   // 두 아들에게 줄 쿠키 수가, 전체 구간합을 반으로 나눈 것과 같다면 최대값이므로 더이상 계산 X
                        answer = first; // answer보다는 크고, first랑 second가 같은 경우
                        break;
                    }
                    else if(first < second) break;  // second가 더 커진 경우, r을 더 늘리며 더할 필요 없음.
                }

            }
        }

        // 주석처리 한 건 시간 초과 걸렸던 방법
//        for(int l=0; l<cookie.length-1; l++){
//            for(int m=l; m<cookie.length-1; m++){
//                first = counting(cookie, l, m);
//                if(first <= answer) continue;   // 시간 줄이기 위해 first가 answer보다 크지 않으면 second는 계산하지 않는다.
//                for(int r=m; r<cookie.length; r++) {
//                    second = counting(cookie, m+1, r);
//                    if(first == second) answer = second;
//                }
//            }
//        }
        return answer;
    }

//    public int counting(int[] cookie, int start, int end){
//        int result=0;
//        for(int i=start; i<=end; i++) result += cookie[i];
//        return result;
//    }
}
